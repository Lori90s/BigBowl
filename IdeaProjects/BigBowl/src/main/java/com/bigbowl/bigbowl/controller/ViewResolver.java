package com.bigbowl.bigbowl.controller;

import com.bigbowl.bigbowl.model.ItemRepository;
import com.bigbowl.bigbowl.model.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewResolver {

    @Autowired
    private OrderRepository or;
   // @Autowired
    //private ItemRepository itemRepository;

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/mork")
    public String restaurantView(){
        return "mork";
    }

    @RequestMapping(value = "/mork1")
    public String restaurantView1(){
        return "mork1";
    }

    @RequestMapping(value = "/mork2")
    public String restaurantView2(){
        return "mork2";
    }

    @RequestMapping(value = "/mork3")
    public String restaurantView3(){
        return "mork3";
    }

    @RequestMapping(value = "/orderHistory")
    public String orderHistoryView(Model model){

        List ol = or.findAllBy();
        System.out.print(ol.isEmpty());

        model.addAttribute("orderHistory",ol);
        return "orderHistory";
    }


    @RequestMapping(value = "/order/{id}")
    public String orderView(@PathVariable Long id, Model model){
        model.addAttribute("orderdetail", or.findById(id));
        return "order";
    }

}
