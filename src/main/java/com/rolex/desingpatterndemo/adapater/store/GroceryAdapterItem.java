package com.rolex.desingpatterndemo.adapater.store;

import com.rolex.desingpatterndemo.adapater.restaurant.Item;


public class GroceryAdapterItem implements Item {

    GroceryItem item;
    public GroceryAdapterItem(GroceryItem item){
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getItemName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }
}
