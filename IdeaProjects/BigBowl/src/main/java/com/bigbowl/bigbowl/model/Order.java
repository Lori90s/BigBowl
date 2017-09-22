package com.bigbowl.bigbowl.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "oHistory")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     long id;



    @OneToOne
    @JoinColumn(name = "itemInTrolley")
     Item itemBooked;
     String status;
     int quantity;

    public Order(){}


    public Order(String status, int quantity, Item item){
        this.status = status;
        this.quantity = quantity;
        this.itemBooked = item;
    }

    public Item getItem() {
        return itemBooked;
    }

    public void setItem(Item item) {
        this.itemBooked = item;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





}
