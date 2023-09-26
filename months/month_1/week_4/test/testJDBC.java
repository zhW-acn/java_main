package months.month_1.week_4.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;
import java.util.Scanner;

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
            // 在com.mysql.jdbc.Driver类中存在静态代码块
            /*
                static {
				        try {
				            java.sql.DriverManager.registerDriver(new Driver());
				        } catch (SQLException E) {
				            throw new RuntimeException("Can't register driver!");
				        }
				}
            */

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "acane");
    Statement statement = connection.createStatement();
    ResultSet resultSet;
    String sql;

    public testJDBC() throws SQLException {
    }


    @Test
    public void testStatement() throws SQLException { // 使用Statement
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
    public void testPrepare() throws SQLException {// 使用PreparedStatement

        sql = "select * from test where username = ? and password = ?";
        String input1 = "1";
        String input2 = "1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 替换占位符
        preparedStatement.setString(1, input1);
        preparedStatement.setString(2, input2);

        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + "\t" +// 字段
                            resultSet.getString("username") + "\t" +
                            resultSet.getString("password")
            );
        }
    }

    // 遇到了：this is incompatible with sql_mode=only_full_group_by
    // 如何解决：SET @@global.sql_mode ='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
    @Test
    public void testExe() throws SQLException {
        sql = "SELECT tp_watchs.id AS `id`,\n       tp_watchs.name AS `name`,\n       MIN(tp_watchs.money) AS `最小金额`,\n       tp_watchs.brand_zh AS `品牌`,\n       date AS `日期`\nFROM tp_watchs\nWHERE date LIKE '2016%'\nGROUP BY tp_watchs.brand_zh";

        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
        }

    }



    @Test
    public void testCommit() throws SQLException {
        connection.setAutoCommit(false);
        sql = "insert into test(username,password) values(?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        for (int i = 0; i < 5; i++) {
            preparedStatement.setString(1,i+"");
            preparedStatement.setString(2,i+"");
            preparedStatement.execute();
        }
        connection.commit();

    }


    @After
    public void close() throws SQLException {

        connection.close();
    }
}
