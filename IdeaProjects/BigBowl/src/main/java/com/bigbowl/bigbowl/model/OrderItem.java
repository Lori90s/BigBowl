package com.bigbowl.bigbowl.model;

public class OrderItem {



     long itemId;
     int quantity;

    public OrderItem( long itemId, int quantity){
        this.itemId = itemId;

        this.quantity = quantity;
    }

    public OrderItem(){

    }






    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
