package com.bmft.dao;

import com.bmft.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUsers();
}
