package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findAllProduct")
    public String findAllProduct(Model model) {

        List<Items> itemsList = productService.findAllProduct();

        model.addAttribute("itemsList",itemsList);

        return "/items/itemsList";
    }

    @RequestMapping("/editProduct")
    public String editProduct(Integer id,Model model) {

        Items item= productService.findProductById(id);

        model.addAttribute("item",item);

        //changed


        return "/items/editItems";
    }

    public static void main(String[] args) {
        System.out.println("changed");
        System.out.println("C 1st update");
        System.out.println("C 2st update");
        System.out.println("C 3rd update");
        System.out.println("D 3rd update");

    }
}
