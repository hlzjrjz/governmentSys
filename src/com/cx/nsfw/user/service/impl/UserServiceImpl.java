package com.cx.nsfw.user.service.impl;

import com.cx.nsfw.user.dao.UserDao;
import com.cx.nsfw.user.entity.User;
import com.cx.nsfw.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by cxspace on 16-8-23.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void delete(Serializable id) {
        userDao.delete(id);
    }

    @Override
    public List<User> findObiects() {
        return userDao.findObjects();
    }

    @Override
    public User findObjectById(Serializable id) {
        return userDao.findObjectById(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
