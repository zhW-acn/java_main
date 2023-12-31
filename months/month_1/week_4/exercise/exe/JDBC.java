package months.month_1.week_4.exercise.exe;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Description: 模拟事务执行失败，保存存档点，写入日志文件。
 * @author: acn
 * @date: 2023/09/26/9:49
 */
public class JDBC {

    public static List<Integer> falseList = new ArrayList<>(10); // 用list保存插入失败的编号。。这样的话还需要定义一个对象，
    // 这个对象就是一条数据库记录，然后下次插入就反序列化 get对象属性再尝试插入。懒得写了就这样吧
    public JDBC() throws SQLException {
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "acane");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static String sql;


    public static void insertData() throws SQLException {
        connection.setAutoCommit(false);
        sql = "insert into test(username,password) values(?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        Savepoint savepoint = connection.setSavepoint();

        for (int i = 1; i <= 1000; i++) {
            try {

                preparedStatement.setString(1, i + "");
                preparedStatement.setString(2, i + "");
                preparedStatement.execute();
                if (i % 500 == 0) {
                    savepoint = connection.setSavepoint();
                }
                if (i % 1000 == 0) {
                    int e = 1 / 0;
                }
            } catch (Exception e) {
                falseList.add(i); // 保存插入失败的编号
                ioStorage(getCurrentTime()+"\t第"+i+"个插入失败\t异常类型："+e.getMessage()+"\n");
                connection.rollback(savepoint);
            } finally {
                connection.commit();
            }
        }
    }

    public static String getCurrentTime() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        return simpleDateFormat.format(date);
    }

    public static void ioStorage(String s){
        final String path = "F:\\GitHub\\java_main\\months\\month_1\\week_4\\exercise\\exe\\journal.txt";
        try(OutputStream fw = new FileOutputStream(new File(path),true)) {
            fw.write(s.getBytes());
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        insertData();
    }

}
