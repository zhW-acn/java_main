package months.month_1.week_1.exercise.OnlineExerciseSystem;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Description: 写入数据库，保存到表score
 * @author: acn
 * @date: 2023/09/27/9:01
 */
public class JDBC {
    private static Properties properties = new Properties();

    static {
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeInDdataBase(String name, int score, int time) {
        try {

            Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
            String insertSQL = "insert into `score` (name,score,time) values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(insertSQL);
            ps.setString(1, name);
            ps.setInt(2, score);
            ps.setInt(3, time);
            ps.execute();
        } catch (Exception e) {
            System.out.println("插入数据库失败");
        }

    }

    public static void main(String[] args) throws SQLException {
        writeInDdataBase("test", 1, 1);
    }
}
