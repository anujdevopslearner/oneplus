package in.cashify.oneplus.productdiscovery;

import in.cashify.oneplus.util.ConfigManager;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.ITestContext;
import static io.restassured.RestAssured.*;


public class BrandService {

    public BrandDetails getBrands(ITestContext context)
    {
        String url = ConfigManager.CONFIG_MANAGER.getConfig().getProduct_url();
        //System.out.println(url+"fwef");
        Response response = given().contentType(ContentType.JSON).get(url);
        BrandDetails brandservices = response.as(BrandDetails.class, ObjectMapperType.GSON);
        context.setAttribute("brandId", brandservices.getBrandDts().get(0).getBrandId());
       // System.out.println(brandservices.getBrandDts().get(0).getBrandId());
        return brandservices;

    }
}
