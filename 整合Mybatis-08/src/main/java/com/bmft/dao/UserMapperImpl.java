package com.bmft.dao;

import com.bmft.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public List<User> selectUsers() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUsers();
    }

}
