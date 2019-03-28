package Helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetData {

        static Properties properties;

        InputStream inputStream = null;

        public GetData() {
            properties = new Properties();
            loadProperties();
        }

        private void loadProperties() {
            try {
                inputStream = new FileInputStream("src/test/resources/config.properties");
                properties.load(inputStream);
            } catch (IOException e) {
                System.out.print("Unable to load config.properties");
                e.printStackTrace();
            }
        }

        public static String readProperty(String key) {
            return properties.getProperty(key);
        }


        //Return values
        public String getSubsidieBaseUrl () {
            return readProperty("BaseURL");
        }



}
