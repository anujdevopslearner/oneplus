package in.cashify.oneplus.util;

import com.google.gson.annotations.SerializedName;

public class Config {

    @SerializedName("env")
    private String environment;

    @SerializedName("product_url")
    private String product_url;

    public String getProduct_url() {
        return product_url;
    }

    public String getEnvironment() {
        return environment;
    }

    }

