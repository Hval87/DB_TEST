SELECT project.name AS Project,test.name AS Test,test.end_time AS Date FROM test JOIN project ON test.project_id=project.id WHERE test.end_time >"2015-10-7" ORDER BY project.name, Test
