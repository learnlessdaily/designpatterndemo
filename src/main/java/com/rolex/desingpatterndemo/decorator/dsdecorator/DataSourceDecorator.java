package com.rolex.desingpatterndemo.decorator.dsdecorator;

import com.rolex.desingpatterndemo.decorator.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    protected DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
