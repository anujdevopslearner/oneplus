package in.cashify.oneplus.productdiscovery;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class BrandTestCase {
    @Test
    void firstTest(ITestContext context) {
        BrandDetails brand = new BrandService().getBrands(context);
       //BrandDetails mybrand = (BrandDetails) context.getAttribute("myBrandId");
       System.out.println(brand.getBrandDts().get(0).getBrandId());
        System.out.println(brand.getBrandDts().get(0).getBrandName());


    }
}
