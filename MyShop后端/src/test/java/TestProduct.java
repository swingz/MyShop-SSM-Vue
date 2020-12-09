import cn.swingz.entity.TProduct;
import cn.swingz.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestProduct {

    @Autowired
    IProductService productService;

    @Test
    public void testAddProduct(){
        TProduct product = new TProduct();
        product.setPid(1000L);
        product.setPname("HUAWEI P30");
        product.setPrice(6799L);

        productService.addProduct(product);
    }
}
