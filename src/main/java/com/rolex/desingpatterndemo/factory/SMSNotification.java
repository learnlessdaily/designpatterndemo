package com.rolex.desingpatterndemo.factory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SMSNotification implements Notification {

    public Object notifyUser(){
        return sentNotificationAndGetDetails();
    };

    public Object sentNotificationAndGetDetails(){
       String res = "{\n" +
               "  \"userid\": \"YourUsername\",\n" +
               "  \"password\": \"YourPassword\",\n" +
               "  \"senderid\": \"SMSGAT\",\n" +
               "  \"msgType\": \"text\",\n" +
               "  \"duplicateCheck\": \"true\",\n" +
               "  \"sms\": [\n" +
               "    {\n" +
               "      \"mobile\": [9999999999],\n" +
               "      \"msg\": \"hello world\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"mobile\": [1234567890],\n" +
               "      \"msg\": \"hello world again\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"mobile\": [12345678990,9999999999],\n" +
               "      \"msg\": \"Final last msg\"\n" +
               "    }\n" +
               "  ]\n" +
               "}";

       return res;
    }
}
