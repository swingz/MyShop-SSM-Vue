package cn.swingz.controller;

import cn.swingz.entity.TProduct;
import cn.swingz.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    IProductService productService;

    @RequestMapping("list")
    public List<TProduct> getProducts(){
        return productService.getProducts();
    }

    @RequestMapping("getProduct")
    public TProduct getProduct(Long pid){
        return productService.getProduct(pid);
    }
}
