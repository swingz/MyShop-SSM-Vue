import cn.swingz.common.utils.MyUtil;
import cn.swingz.entity.TOrder;
import cn.swingz.entity.TProduct;
import cn.swingz.entity.vo.OrderVO;
import cn.swingz.service.IOrderService;
import cn.swingz.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestOrder {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IProductService productService;

    @Test
    public void addOrder(){
        OrderVO orderVO = new OrderVO();

        TOrder tOrder = new TOrder();
        tOrder.setUserId(1L);
        tOrder.setOrderPrice(8812L);
        tOrder.setOrderFlag((short)0);
        tOrder.setOrderId(Long.parseLong(MyUtil.getCurrentTime()));
        tOrder.setOrderAddr("广东省深圳市");
        tOrder.setOrderTel("18888888889");
        tOrder.setOrderUser("张三");
        tOrder.setCreatedTime(new Date());
        tOrder.setUpdatedTime(new Date());
        orderVO.settOrder(tOrder);

//        List<TProduct> products = productService.getProducts();
//        orderVO.setProducts(products);

        orderService.addOrder(orderVO);

    }

    @Test
    public void uuid(){
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
