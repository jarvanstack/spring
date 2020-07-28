package com.bmft.dao;

import com.bmft.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUsers();
    int insertUser(User user);
    int deleteUserById(@Param("id")int id);
    int updateUser(Map<String ,Object> map);
}
