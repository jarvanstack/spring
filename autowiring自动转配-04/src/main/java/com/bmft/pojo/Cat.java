package com.bmft.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Cat implements Serializable {
    public void shout() {
        System.out.println("miao~");
    }
}