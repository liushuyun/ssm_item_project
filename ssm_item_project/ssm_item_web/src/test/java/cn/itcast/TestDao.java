
package cn.itcast;

import cn.itcast.dao.ProductDao;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestDao {

    @Autowired
    private ProductDao productDao;


    @Test
    public void testFindAllProduct() {

        List<Items> products = productDao.findAllProduct();

        for (Items product : products) {
            System.out.println(product);
        }
    }

    @Test
    public void testFindProductById() {

        Items product = productDao.findProductById(1);
        System.out.println(product);
    }
}