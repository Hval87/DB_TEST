package util;

import tests.model.CountOfTestsByBrowser;
import tests.model.ProjectLimitedByDate;
import tests.model.ProjectWithUniqueTestsModel;
import tests.model.TestWorkingTime;
import java.util.List;

public class ViewTable {
    public static String displayProjectLimitedByDate(List<ProjectLimitedByDate> list) {
        StringBuilder str = new StringBuilder();
        str.append(String.format("\n| %-13s || %-140s ||  %10s |%n","PROJECT","TEST","DATA"));
        for (ProjectLimitedByDate tmp : list) {
            String stringa = String.format("| %-13s || %-140s ||  %10s |%n", tmp.getProject(), tmp.getTest(), tmp.getDate());
            str.append(stringa);
        }
        return str.toString();
    }

    public static String displayProjectWithUniqueTests(List<ProjectWithUniqueTestsModel> list) {
        StringBuilder str = new StringBuilder();
        str.append(String.format("\n| %-13s ||  %-8s |%n", "PROJECT", "TESTS COUNT"));
        for (ProjectWithUniqueTestsModel tmp : list) {
            String stringa = String.format("| %-13s ||  %-8s |%n", tmp.getProject(), tmp.getTestsCount());
            str.append(stringa);
        }
        return str.toString();
    }

    public static String displayWorkingTimeOfTest(List<TestWorkingTime> list) {
        StringBuilder str = new StringBuilder();
        str.append(String.format("\n| %-13s || %-140s ||  %10s |%n", "PROJECT", "TEST", "MIN WORKING TIME"));
        for (TestWorkingTime tmp : list) {
            String stringa = String.format("| %-13s || %-140s ||  %10s |%n", tmp.getProject(), tmp.getTest(), tmp.getMinworkingtime());
            str.append(stringa);
        }
        return str.toString();
    }
    public static String displayCountOfTestsByBrowser(List<CountOfTestsByBrowser> list) {
        StringBuilder str = new StringBuilder();
        str.append(String.format("\n| %-13s |%n", "BROWSER"));
        for (CountOfTestsByBrowser tmp : list) {
            String stringa = String.format("| %-13s |%n", tmp.getBrowsers());
            str.append(stringa);
        }
        return str.toString();
    }
}
