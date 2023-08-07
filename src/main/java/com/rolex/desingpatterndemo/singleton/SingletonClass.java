package com.rolex.desingpatterndemo.singleton;

public class SingletonClass {

    private static volatile SingletonClass obj;

    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if(obj == null){
            synchronized(SingletonClass.class){
                if(obj == null){
                    obj = new SingletonClass();
                }
            }
        }
        return obj;
    }
}
