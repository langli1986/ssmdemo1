package net.wanho.ssm.service;

import net.wanho.ssm.entity.User;

import java.util.List;

public interface UserService {

    List<User> queryUsers()throws Exception;

    void deleteUser(int id)throws Exception;

    void addUser(String username)throws Exception;

    User getUser(int id)throws Exception;

    void updateUser(User user)throws Exception;
}
