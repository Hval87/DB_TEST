package tests;

import org.sql2o.Connection;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.DBConManager;

public class BaseTest {
    private Connection con;
    @BeforeMethod
    public void setUp(){
        con=DBConManager.getConnection();
    }
    
    @AfterMethod
    public void tearDown(){
        con.close();
    }
}
