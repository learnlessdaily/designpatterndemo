package com.rolex.desingpatterndemo.observable.observor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NDTVChannel implements Channel{

    private String news;
    @Override
    public void update(Object o) {
       setNews( (String) o);
    }
}
