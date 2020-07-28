package com.bmft.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class Dao01 {
    @Value("dao-name")
    private String name ;
}
