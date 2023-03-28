package ru.shop.shopservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shop.shopservice.dto.Product;
import ru.shop.shopservice.service.ICrudService;
import ru.shop.shopservice.service.IProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController extends CrudController<Product> {

    @Autowired
    private IProductService productService;

    @Override
    public ICrudService<Product> getService() {
        return productService;
    }

    @GetMapping("/search/findByName")
    public List<Product> findByName(@RequestParam String name) {
        return productService.findByName(name);
    }


}
