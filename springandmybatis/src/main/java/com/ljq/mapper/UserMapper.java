package com.ljq.mapper;

import com.ljq.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int deleteUser(int id);
    int addUser(User user);
}
