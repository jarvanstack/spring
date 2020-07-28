package com.bmft.service;

import lombok.Data;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
public class Service01 {
    @Value("service-name")
    private String name;
}
