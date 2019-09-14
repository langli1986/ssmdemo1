package net.wanho.ssm.service.impl;

import net.wanho.ssm.entity.User;
import net.wanho.ssm.mapper.UserMapper;
import net.wanho.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper userMapper;

    @Override
    public List<User> queryUsers()throws Exception {

        return userMapper.query();
    }

    @Override
    public void deleteUser(int id)throws Exception {
        userMapper.delete(id);
    }

    @Override
    public void addUser(String username) throws Exception {
        userMapper.add(username);
    }

    @Override
    public User getUser(int id) throws Exception {
        return userMapper.get(id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userMapper.update(user);
    }
}
