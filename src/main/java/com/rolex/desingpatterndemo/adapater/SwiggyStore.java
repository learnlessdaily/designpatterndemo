package com.rolex.desingpatterndemo.adapater;

import com.rolex.desingpatterndemo.adapater.restaurant.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class SwiggyStore {
    List<Item> items = new ArrayList<>();

    public void addItems(Item item){
        items.add(item);

    }
}
