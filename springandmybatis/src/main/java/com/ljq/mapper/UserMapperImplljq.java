package com.ljq.mapper;

import com.ljq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImplljq extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> selectUser() {
        User user = new User(6, "ljq", "eqwewe");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(1);
        return mapper.selectUser();

    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);

    }
}
