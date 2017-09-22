package com.bigbowl.bigbowl.controller;

import com.bigbowl.bigbowl.model.ItemRepository;
import com.bigbowl.bigbowl.model.Order;
import com.bigbowl.bigbowl.model.OrderRepository;
import com.bigbowl.bigbowl.model.OrderItem;
import com.bigbowl.bigbowl.utils.Ajax;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Controller
@RequestMapping(value = "/api/order")
public class OrderController {


    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ItemRepository itemRepository;




    //Create an order
    @PostMapping
    public Ajax createOrder(@RequestBody OrderItem order){
        try{
            System.out.println("!999999!!!"+order.getItemId()+order.getQuantity());

            orderRepository.save(new Order("Placed",
                    order.getQuantity(),
                    itemRepository.findById(order.getItemId())
                   ));

            System.out.println("!******************!!"+order.getItemId()+order.getQuantity());

            return new Ajax(200, "Order Created",null);

        }catch (Exception e){
            return new Ajax(500,"Create Order Error",null);
        }
    }


    // Update order
    @PutMapping(value = "/{id}")
    public Ajax updateOrder(@PathVariable Long id){
        try{

            Order o = orderRepository.findById(id);
            o.setStatus("Cancelled");
            orderRepository.save(o);

            return new Ajax(200,"Order Canceled",null);
        }catch(Exception e){
            return new Ajax(500,"Update Order Error",null);
        }
    }


    //delete order
    @DeleteMapping(value = "/{id}")
    public Ajax deleteOrder(@PathVariable Long id){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!"+id);
        try{

            orderRepository.delete(orderRepository.findById(id));

            return new Ajax(200,"Order Deleted",null);
        }catch(Exception e){
            return new Ajax(500,"Delete Order Error",null);
        }
    }


}
