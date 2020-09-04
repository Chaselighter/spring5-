package com.ljq.mapper;

import com.ljq.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;
    //所有的操作都使用sqlsession来执行在原来，现在都是用sqlsessionTemplate
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();

    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}
