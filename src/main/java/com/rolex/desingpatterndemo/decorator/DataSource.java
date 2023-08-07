package com.rolex.desingpatterndemo.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
