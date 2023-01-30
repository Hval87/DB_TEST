package util;

import lombok.extern.log4j.Log4j;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

@Log4j
public class MyParser {
    private static final String CONFIG_SRC = "src/test/resources/configData.json";
    private static JSONParser parser;

    static {
        parser = new JSONParser();
    }
    public static <T> T getConfigValue(String key) {
        JSONObject data = null;
        try {
            data = (JSONObject) parser.parse(new FileReader(CONFIG_SRC));
        } catch (Exception e) {
            log.error("parsing error", e);
        }
        return (T) data.get(key);
    }
}