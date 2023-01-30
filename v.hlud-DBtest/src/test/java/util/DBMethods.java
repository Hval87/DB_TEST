package util;

import org.sql2o.Query;

import java.util.List;

public class DBMethods {
    private static Query executeScript(String scriptPath) {
        return DBConManager.getConnection().createQuery(scriptPath);
    }
    public static <T> List getListFromDB(String script, Class type) {
        return executeScript(script).executeAndFetch(type);
    }
}
