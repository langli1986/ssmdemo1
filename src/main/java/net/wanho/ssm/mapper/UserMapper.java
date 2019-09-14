package net.wanho.ssm.mapper;

import net.wanho.ssm.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> query()throws Exception;

    void delete(int id)throws Exception;

    void add(String username)throws Exception;

    User get(int id)throws Exception;

    void update(User user)throws Exception;
}
