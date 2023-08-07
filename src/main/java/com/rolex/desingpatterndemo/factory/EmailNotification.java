package com.rolex.desingpatterndemo.factory;

public class EmailNotification implements Notification {

    public Object notifyUser(){
        return sentNotificationAndGetDetails();
    };

    public Object sentNotificationAndGetDetails(){
       String res = "{\n" +
               "    \"recipient\":    \"john@doe.com\",\n" +
               "    \"subject\":      \"This is a test mail\",\n" +
               "    \"from\":         \"info@example.com\",\n" +
               "    \"text\":         \"This is the messge body...\",\n" +
               "    \"html\":         \"<html><head>...\"\n" +
               "}";

       return res;
    }
}
