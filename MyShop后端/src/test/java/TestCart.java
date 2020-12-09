import cn.swingz.entity.TCart;
import cn.swingz.entity.vo.CartVo;
import cn.swingz.mapper.TCartMapper;
import cn.swingz.service.ICartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context*.xml")
public class TestCart {

    @Autowired
    TCartMapper cartMapper;

    @Autowired
    ICartService cartService;


    @Test
    public void testCart(){
        TCart cartWithUserIdAndPid = cartMapper.findCartWithUserIdAndPid(2020l, 1001l);
        System.out.println(cartWithUserIdAndPid);
    }

    @Test
    public void testAdd(){
        cartService.addCart(2020l,1002l,1l);
    }

    @Test
    public void testFindCartVoByUserId(){
        List<CartVo> cartsVoByUserId = cartService.getCartsVoByUserId(2020l);
        for (CartVo cartVo : cartsVoByUserId) {
            System.out.println(cartVo);
        }

    }
}
