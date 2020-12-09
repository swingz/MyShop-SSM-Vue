package cn.swingz.service.impl;

import cn.swingz.entity.TProduct;
import cn.swingz.mapper.TProductMapper;
import cn.swingz.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    TProductMapper tProductMapper;

    @Override
    public void addProduct(TProduct product) {
        tProductMapper.insert(product);
    }

    @Override
    public List<TProduct> getProducts() {
        return tProductMapper.selectAll();
    }

    @Override
    public TProduct getProduct(Long pid) {
        return tProductMapper.selectByProductKey(pid);
    }
}
