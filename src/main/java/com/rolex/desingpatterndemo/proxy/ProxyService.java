package com.rolex.desingpatterndemo.proxy;

import org.springframework.stereotype.Service;

@Service
public class ProxyService {

    public String connect(String siteName){
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo(siteName);
            return "Connected to :"+siteName;

        }
        catch (Exception e)
        {
            return "Access Denied :"+siteName;
        }
    }

}
