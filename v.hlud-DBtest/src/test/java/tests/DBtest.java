package tests;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import tests.model.CountOfTestsByBrowser;
import tests.model.ProjectLimitedByDate;
import tests.model.ProjectWithUniqueTestsModel;
import tests.model.TestWorkingTime;
import util.DBMethods;
import util.QueryFileReader;
import util.ViewTable;

import java.util.List;
@Slf4j
public class DBtest extends BaseTest {
    @Test
    public void displayTestWorkingTime() {
        String query = QueryFileReader.getRequest("DisplayMinWorkingTimeQuery.sql");
        List<TestWorkingTime> list = DBMethods.getListFromDB(query, TestWorkingTime.class);
        log.info(ViewTable.displayWorkingTimeOfTest(list));
    }
    @Test
    public void displayProjectWithUniqueTests() {
        String query = QueryFileReader.getRequest("DisplayProjectWithUniqueTestsQuery.sql");
        List<ProjectWithUniqueTestsModel> list = DBMethods.getListFromDB(query, ProjectWithUniqueTestsModel.class);
        log.info(ViewTable.displayProjectWithUniqueTests(list));
    }
    @Test
    public void displayProjectLimitedByDate() {
        String query = QueryFileReader.getRequest("DisplayProjectLimitedByDate.sql");
        List<ProjectLimitedByDate> list = DBMethods.getListFromDB(query, ProjectLimitedByDate.class);
        log.info(ViewTable.displayProjectLimitedByDate(list));
    }
    @Test
    public void DisplayTestNumberRunningDiffBrowserQuery() {
        String query = QueryFileReader.getRequest("DisplayTestNumberRunningDiffBrowserQuery.sql");
        List<CountOfTestsByBrowser> list = DBMethods.getListFromDB(query, CountOfTestsByBrowser.class);
        System.out.println(list.size());
        log.info(ViewTable.displayCountOfTestsByBrowser(list));
    }
}
