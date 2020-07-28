package com.bmft.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
@Data
public class Controller01 {
    @Value("controller-name")
    private String name;
}
