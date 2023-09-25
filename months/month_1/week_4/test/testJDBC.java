package months.month_1.week_4.test;

import org.junit.Test;

import java.sql.*;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/25/14:31
 */
public class testJDBC {
    //1. 注册驱动（只需一次）
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void teststatement() throws SQLException { // 使用Statement
        //2. 建立连接（Connection）

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "acane");

        // 带参连接
        //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=acane");

        // 使用配置文件类
            /*
            Properties properties = new Properties();
            properties.put("user","root");
            properties.put("password","acane");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",properties);
            */
        //3. 创建执行器Statement
        Statement statement = connection.createStatement();

        //4. 执行语句
        String sql = "select * from test";

        ResultSet resultSet = statement.executeQuery(sql);
        //5. 处理结果（ResultSet）
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + "\t" +// 字段
                            resultSet.getString("username") + "\t" +
                            resultSet.getString("password")
            );
        }

        //6. 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void testprepare() throws SQLException {// 使用PreparedStatement

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "acane");
        String sql = "select * from test where username = ? and password = ?";
        String input1 = "1";
        String input2 = "1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 替换占位符
        preparedStatement.setString(1, input1);
        preparedStatement.setString(2, input2);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + "\t" +// 字段
                            resultSet.getString("username") + "\t" +
                            resultSet.getString("password")
            );
        }
    }

}
