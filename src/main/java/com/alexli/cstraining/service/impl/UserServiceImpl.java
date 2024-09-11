package com.alexli.cstraining.service.impl;

import com.alexli.cstraining.mapper.UserMapper;
import com.alexli.cstraining.model.User;
import com.alexli.cstraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }

    @Override
    public User findByuserId(String userId) {
        return userMapper.selectByPrimaryKey(Integer.parseInt(userId));
    }

    /*@Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userMapper.findByUsernameAndPassword(username,password);
    }
    @Override
    public void delete(List<Integer> idList) {
        for (Integer id : idList)
            userMapper.deleteById(id);
    }
    @Override
    public User queryById(Integer id) {
        return userMapper.findById(id).orElse(null);
    }
    @Override
    public User save(User user) {
        return userMapper.save(user);
    }
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
    */
}
