package in.cashify.oneplus.productdiscovery;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BrandDetails {

    public List<GetBrandDt> getBrandDts() {
        return brandDts;
    }

    @SerializedName("dt")
    private List<GetBrandDt> brandDts;



}
