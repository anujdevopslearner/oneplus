package in.cashify.oneplus.productdiscovery;

import com.google.gson.annotations.SerializedName;

public class GetBrandDt {

    @SerializedName ("bn")
    private String BrandName;

    public String getBrandId() {
        return brandId;
    }

    @SerializedName("bid")
    private String brandId;


    public String getBrandName() {
        return BrandName;
    }



}
