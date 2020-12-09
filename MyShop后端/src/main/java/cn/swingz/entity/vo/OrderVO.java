package cn.swingz.entity.vo;

import cn.swingz.entity.TOrder;
import cn.swingz.entity.TProduct;

import java.util.List;

/**
 * 跟订单相关的数据实体
 */
public class OrderVO {

    private TOrder tOrder;

    private List<TProduct> products;

    public TOrder gettOrder() {
        return tOrder;
    }

    public void settOrder(TOrder tOrder) {
        this.tOrder = tOrder;
    }

    public List<TProduct> getProducts() {
        return products;
    }

    public void setProducts(List<TProduct> products) {
        this.products = products;
    }
}
