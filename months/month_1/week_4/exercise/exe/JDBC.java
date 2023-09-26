package months.month_1.week_4.exercise.exe;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/26/9:49
 */
public class JDBC {

    public static List<Integer> falseList = new ArrayList<>(10);
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

        for (int i = 1; i <= 100; i++) {
            try {
                if (i % 10 == 0) {
                    int e = 10 / 0;
                }
                if (i % 5 == 0) {
                    connection.commit();
                    savepoint = connection.setSavepoint();
                }
                preparedStatement.setString(1, i + "");
                preparedStatement.setString(2, i + "");
                preparedStatement.execute();
            } catch (Exception e) {
                falseList.add(i);
                ioStorage(getCurrentTime()+"\t第"+i+"个插入失败\t异常类型："+e.getMessage()+"\n");
                connection.rollback(savepoint);
            } finally {
                connection.commit();
                savepoint = connection.setSavepoint();
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
