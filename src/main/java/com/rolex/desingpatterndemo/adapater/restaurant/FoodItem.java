package com.rolex.desingpatterndemo.adapater.restaurant;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FoodItem implements Item{
    private String itemName;
    private String price;
    private String restaurantName;
    public FoodItem(String itemName, String price, String restaurantName){
        this.itemName = itemName;
        this.price = price;
        this.restaurantName = restaurantName;
    }
}

