package com.bmft.service;

import com.bmft.dao.UserMapper;
import com.bmft.pojo.User;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@Data
@NoArgsConstructor
public class UserService {
    UserMapper userMapper;

    public void test(){
        userMapper.insertUser(new User(21,"ab","dfaf"));//增加OK
        userMapper.deleteUserById(1);//删除给个UserMapper.xml------bug

        List<User> users = userMapper.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
