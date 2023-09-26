package months.month_1.week_4.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/26/14:49
 */
public class DataSourceUtils {

    private static DataSource ds;
    private static QueryRunner qr = new QueryRunner(getDs());

    public static DataSource getDs() {
        ds = new ComboPooledDataSource();
        return ds;
    }

    public static QueryRunner getQr() {
        return qr;
    }

    private DataSourceUtils() {
    }
}
