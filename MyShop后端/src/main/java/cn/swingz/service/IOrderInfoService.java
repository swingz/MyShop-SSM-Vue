package cn.swingz.service;

import cn.swingz.entity.TOrderinfo;

import java.util.List;

public interface IOrderInfoService {

    void addOrderInfo(List<TOrderinfo> orderinfos) throws Exception;
}
