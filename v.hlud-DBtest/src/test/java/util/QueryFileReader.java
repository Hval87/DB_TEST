package util;

import lombok.SneakyThrows;
import java.io.BufferedReader;
import java.io.FileReader;

public class QueryFileReader {
    @SneakyThrows
    public static String getRequest(String path) {
        path = FileProvider.getPath(path);
        return new BufferedReader(new FileReader(path)).readLine();
    }
}

