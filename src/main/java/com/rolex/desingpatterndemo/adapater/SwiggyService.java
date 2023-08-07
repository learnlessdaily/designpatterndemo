package com.rolex.desingpatterndemo.adapater;

import com.rolex.desingpatterndemo.adapater.restaurant.FoodItem;
import com.rolex.desingpatterndemo.adapater.store.GroceryAdapterItem;
import com.rolex.desingpatterndemo.adapater.store.GroceryItem;
import com.rolex.desingpatterndemo.adapater.store.GroceryProduct;
import org.springframework.stereotype.Service;


@Service
public class SwiggyService {

    public Object getService(){
        SwiggyStore store = new SwiggyStore();
        store.addItems(new FoodItem("Chiken", "100 RS", "DINDIGUVAL" ));
        store.addItems(new FoodItem("THANDOOR", "200 RS", "aNJAPAR" ));
        store.addItems(new FoodItem("Chiken", "100 RS", "DINDIGUVAL" ));
        GroceryProduct product = new GroceryProduct("GoldWinner", "90 RS", "Saravan Store");
        store.addItems(new GroceryAdapterItem(product));
        return (Object) store;
    }

}
