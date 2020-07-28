package com.bmft.dao;

import com.bmft.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl02 extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectUsers() {
        SqlSession sqlSession = getSqlSession();
        return sqlSession.getMapper(UserMapper.class).selectUsers();
    }
}
