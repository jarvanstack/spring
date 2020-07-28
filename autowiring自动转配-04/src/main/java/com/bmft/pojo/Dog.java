package com.bmft.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Dog implements Serializable {
    public void shout() {
        System.out.println("wang~");
    }
}