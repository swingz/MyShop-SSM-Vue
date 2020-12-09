package cn.swingz.controller;

import cn.swingz.entity.TCart;
import cn.swingz.entity.vo.CartVo;
import cn.swingz.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cart")
public class CartController {

    @Autowired
    private ICartService cartService;

    @RequestMapping("cartList")
    public List<CartVo> getCartList(Long userId){
        return cartService.getCartsVoByUserId(userId);
    }

    @RequestMapping("addCart")
    public void addCart(Long userId,Long pid,Long pcount){
        cartService.addCart(userId, pid, pcount);
    }
}
