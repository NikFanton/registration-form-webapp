package ua.training.model.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationUtil {
    private static Properties properties = new Properties();
    private static InputStream in = null;

    public static String getProperty(String propertyName) {
        FileInputStream fis = null;
        try {
            in = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }
}
