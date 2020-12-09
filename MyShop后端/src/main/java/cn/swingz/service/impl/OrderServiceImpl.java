package cn.swingz.service.impl;

import cn.swingz.entity.TOrder;
import cn.swingz.entity.TOrderinfo;
import cn.swingz.entity.TProduct;
import cn.swingz.entity.vo.OrderVO;
import cn.swingz.mapper.TOrderMapper;
import cn.swingz.service.IOrderInfoService;
import cn.swingz.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    TOrderMapper tOrderMapper;

    @Autowired
    IOrderInfoService orderInfoService;

    /**
     * TOrder
     * List<TProduct>
     *
     * 往订单表里填数据
     * 往订单详情表里填数据
     * 往已售商品表里天数据
     * @param orderVO
     */
    @Override
    @Transactional( rollbackFor = Exception.class)
    public void addOrder(OrderVO orderVO) {
        TOrder tOrder = orderVO.gettOrder();
        List<TProduct> products = orderVO.getProducts();
        //将order 存到数据库中
        tOrderMapper.insert(tOrder);

        //将数据存入订单详情表中
        List<TOrderinfo> tOrderinfos = new ArrayList<>();
//        Long orderId = tOrder.getOrderId();
//        Iterator<TProduct> iterator = products.iterator();
//        while(iterator.hasNext()){
//            TProduct next = iterator.next();
//            TOrderinfo tOrderinfo = new TOrderinfo();
//            tOrderinfo.setPid(next.getPid());
//            tOrderinfo.setOrderId(orderId);
//            tOrderinfos.add(tOrderinfo);
//        }
        try {
            orderInfoService.addOrderInfo(tOrderinfos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
