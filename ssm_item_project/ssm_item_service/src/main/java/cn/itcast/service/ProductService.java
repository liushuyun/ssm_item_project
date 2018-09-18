package cn.itcast.service;

import cn.itcast.domain.Items;

import java.util.List;

public interface ProductService {

    List<Items> findAllProduct();

    Items findProductById(Integer id);
}
