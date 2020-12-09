package cn.swingz.service.impl;

import cn.swingz.entity.TOrderinfo;
import cn.swingz.mapper.TOrderinfoMapper;
import cn.swingz.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class OrderInfoSerivceImpl implements IOrderInfoService {

    @Autowired
    TOrderinfoMapper orderinfoMapper;

    @Override
    @Transactional( rollbackFor = Exception.class,propagation = Propagation.NESTED)
    public void addOrderInfo(List<TOrderinfo> orderinfos) throws Exception{

        if(orderinfos.isEmpty() || orderinfos == null){
            throw new NullPointerException();
        }
        orderinfoMapper.insertOrderInfos(orderinfos);
    }
}
