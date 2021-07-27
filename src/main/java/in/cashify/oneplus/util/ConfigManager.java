package in.cashify.oneplus.util;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import io.restassured.internal.util.IOUtils;

public class ConfigManager {

    public static final ConfigManager CONFIG_MANAGER = new ConfigManager();
    private Config config;

    private ConfigManager() {
        String env = System.getenv("env"); //null
        if (env == null) env = "stage";
        InputStream resourceAsStream = ConfigManager.class.getClassLoader().getResourceAsStream("config/" + env + ".json");
        System.out.println(resourceAsStream);
        assert resourceAsStream != null;
        try {
            String configJson = new String(IOUtils.toByteArray(resourceAsStream));
            Gson gson = new Gson();
            this.config = gson.fromJson(configJson, Config.class);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                resourceAsStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Config getConfig() {
        return config;
    }

}


