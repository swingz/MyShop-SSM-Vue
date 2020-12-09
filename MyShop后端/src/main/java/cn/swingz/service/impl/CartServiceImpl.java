package cn.swingz.service.impl;

import cn.swingz.entity.TCart;
import cn.swingz.entity.TProduct;
import cn.swingz.entity.vo.CartVo;
import cn.swingz.mapper.TCartMapper;
import cn.swingz.service.ICartService;
import cn.swingz.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    TCartMapper cartMapper;

    @Autowired
    IProductService productService;
    @Override
    public List<TCart> getCartsByUserId(Long userId) {
        return cartMapper.selectByUserId(userId);
    }

    @Override
    public void addCart(Long userId,Long pid,Long pcount) {
        //1查看是否有该商品在购物车内

        // 有 添加数量 没有 加入该用户购物车
        TCart tCart = cartMapper.findCartWithUserIdAndPid(userId,pid);
        if(tCart != null){
            tCart.setPcount(tCart.getPcount()+pcount);
            cartMapper.updateByPrimaryKey(tCart);
        }else {
            tCart = new TCart();
            tCart.setUserId(userId);
            tCart.setPid(pid);
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String orderIdPrefix = sdf.format(date);//创建订单编号的前缀
            tCart.setCartId(Long.parseLong(orderIdPrefix + pid));
            tCart.setPcount(pcount);
            cartMapper.insert(tCart);
        }

    }

    @Override
    public List<CartVo> getCartsVoByUserId(Long userId) {
        //2查询该用户所有的购物车信息
        List<TCart> cartsByUserId = getCartsByUserId(userId);
        //3 封装到CartVo
        /**
         *     private Long cartId; cartsByUserId
         *     private Long userId; cartsByUserId
         *     private Long pid; cartsByUserId
         *     private String pname;
         *     private BigDecimal price;
         *     private Long pcount; cartsByUserId
         */
        List<CartVo> tCarts = new ArrayList<>();
        for (TCart cart : cartsByUserId) {
            CartVo tCart1 = new CartVo();
            tCart1.setCartId(cart.getCartId());
            tCart1.setUserId(cart.getUserId());
            tCart1.setPid(cart.getPid());
            TProduct product = productService.getProduct(cart.getPid());
            tCart1.setPname(product.getPname());
            tCart1.setPrice(product.getPrice());
            tCart1.setPcount(cart.getPcount());
            tCarts.add(tCart1);
        }
        return tCarts;
    }
}
