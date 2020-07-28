package com.bmft.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")// 相当于
//<bean id="user" class="com.bmft.pojo.User"/>
@Data
@Scope("prototype")
public class User {
    @Value("bmft2")
    private String name;

}
