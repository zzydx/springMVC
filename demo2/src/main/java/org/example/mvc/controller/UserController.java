package org.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author ZhangZengY
 * @Date 2023/5/31 14:13
 * @Package org.example.controller
 * @Project springMVC
 */
@Controller
public class UserController {
    //查询所有用户信息
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println("getAllUser");
        return "success";
    }

    //查询单个用户
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserByID(@PathVariable("id") Integer id) {
        System.out.println("getUserByID");
        return "success";
    }

    //添加用户信息
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUser() {
        System.out.println("insertUser");
        return "success";
    }

    //删除用户信息
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id) {
        System.out.println("deleteUser");
        return "success";
    }

    //修改用户信息
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser() {
        System.out.println("updateUser");
        return "success";
    }

}
