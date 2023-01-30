package util;

import lombok.SneakyThrows;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DBConManager {
    private static org.sql2o.Connection connection = null;

    private DBConManager() {
    }

    @SneakyThrows
    public static Connection getConnection() {
        if (connection == null) {
            Sql2o sql2o = new Sql2o(MyParser.getConfigValue("sqlDriverURL")
                    , MyParser.getConfigValue("user")
                    , MyParser.getConfigValue("password"));
            connection = sql2o.open();
        }
        return connection;
    }
}
