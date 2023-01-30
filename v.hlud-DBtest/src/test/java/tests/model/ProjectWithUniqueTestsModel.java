package tests.model;

import lombok.Data;

@Data
public class ProjectWithUniqueTestsModel {
    private String Project;
    private long testsCount;
}
