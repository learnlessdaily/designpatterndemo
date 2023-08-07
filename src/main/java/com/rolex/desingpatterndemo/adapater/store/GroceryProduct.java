package com.rolex.desingpatterndemo.adapater.store;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GroceryProduct  implements GroceryItem{
    private String itemName;
    private String price;
    private String storeName;

    public GroceryProduct(String itemName, String price, String storeName){
        this.itemName = itemName;
        this.price = price;
        this.storeName = storeName;
    }

}
