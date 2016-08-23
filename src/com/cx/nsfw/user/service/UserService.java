package com.cx.nsfw.user.service;

import com.cx.nsfw.user.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cxspace on 16-8-23.
 */
public interface UserService {

    public void save(User user);

    public void update(User user);

    public void delete(Serializable id);

    public User findObjectById(Serializable id);

    public List<User> findObiects();

}
