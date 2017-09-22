package com.bigbowl.bigbowl.model;

import javax.persistence.*;


@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     long id;


     String name;
     Double price;
     String image;

    public Item(){

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    public long getItemId() {
        return id;
    }

    public void setItemId(long itemId) {
        this.id = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Item(String name, Double price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }
}
