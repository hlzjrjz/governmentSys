package com.cx.nsfw.user.action;

import com.cx.nsfw.user.entity.User;
import com.cx.nsfw.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-8-23.
 */
public class UserAction extends ActionSupport{

    //这里必须时userService才能在容器中找到userService
    @Resource
    private UserService userService;
    private List<User> userList;

    private String[] selectedRow;

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    //列表页面
    public String listUI(){

        userList = userService.findObiects();
        return "listUI";
    }
    //跳转到新增页面
    public String addUI(){
        return "addUI";

    }
    //保存新增
    public String add(){
        if (user != null)
        {
            userService.save(user);
        }
        return "list";
    }
    //跳转到编辑页面
    public String editUI(){
        //找出原来的信息
        if (user != null && user.getId() != null) {
            user = userService.findObjectById(user.getId());
        }
            return "editUI";
    }
    //保存编辑
    public String edit(){
        if (user != null)
        {
            userService.update(user);
        }
        return "list";
    }
    //删除
    public String delete(){
        if (user != null)
        {
            userService.delete(user.getId());
        }
        return "list";
    }


    //批量删除

    public String deleteSelected(){


        if (selectedRow != null){

            for (String id : selectedRow){
                userService.delete(id);
            }
        }

        return "list";
    }
}
