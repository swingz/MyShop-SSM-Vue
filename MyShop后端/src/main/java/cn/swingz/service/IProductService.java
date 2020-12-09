package cn.swingz.service;

import cn.swingz.entity.TProduct;

import java.util.List;

public interface IProductService {

    void addProduct(TProduct product);

    List<TProduct> getProducts();

    TProduct getProduct(Long pid);
}
