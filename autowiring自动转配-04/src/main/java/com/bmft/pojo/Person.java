package com.bmft.pojo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.Serializable;


@Data
public class Person implements Serializable {
    private String name;
    @Autowired
    private Cat cat;
    @Resource(name = "dog")
    private Dog dog;
}
