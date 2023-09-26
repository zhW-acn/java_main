package months.month_1.week_4.test;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/26/14:45
 */
public class testDataPool {

    @Test
    public void test1() throws SQLException {
        QueryRunner qr = DataSourceUtils.getQr();
        List<User> users = qr.query("select * from test", new BeanListHandler<User>(User.class));
        System.out.println(users);

    }
}
