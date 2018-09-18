package cn.itcast.dao;

import cn.itcast.domain.Items;

import java.util.List;


public interface ProductDao {

    List<Items> findAllProduct();

    Items findProductById(Integer id);
}
