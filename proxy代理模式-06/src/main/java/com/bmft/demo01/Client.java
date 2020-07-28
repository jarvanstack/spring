package com.bmft.demo01;

/**
 * 客人租房
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}



