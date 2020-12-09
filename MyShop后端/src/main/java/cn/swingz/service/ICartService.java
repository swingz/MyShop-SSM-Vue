package cn.swingz.service;

import cn.swingz.entity.TCart;
import cn.swingz.entity.vo.CartVo;

import java.util.List;

public interface ICartService {

    List<TCart> getCartsByUserId(Long userId);

    void addCart(Long userId,Long pid,Long pcount);

    List<CartVo> getCartsVoByUserId(Long userId);
}
