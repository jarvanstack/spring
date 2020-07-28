package com.bmft.dao;

import com.bmft.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUsers() {
        return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }

    @Override
    public int insertUser(User user) {

        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUserById(id);
    }

    @Override
    public int updateUser(Map<String, Object> map) {
        return getSqlSession().getMapper(UserMapper.class).updateUser(map);
    }
}
