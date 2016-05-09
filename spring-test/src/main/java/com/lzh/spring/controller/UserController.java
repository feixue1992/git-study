package com.lzh.spring.controller;

import com.lzh.spring.Exception.RestException;
import com.lzh.spring.dao.UserDao;
import com.lzh.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lzh on 2016/5/2.
 */
@RestController
@RequestMapping("/rest")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(@RequestBody User user) {
        System.out.println("执行save方法-------------!");
        userDao.save(user);
    }

    @RequestMapping(value = "/showList", method = RequestMethod.GET)
    public List<User> list() {
        System.out.println("show list");
        return userDao.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id) {
        System.out.println("get........" + id);
        User user = userDao.find(id);
        if (null == user) {
            System.out.println("null.............");
            throw new RestException(1, "User not found!", "User with id :" + id + "not found in the system");
        }
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") int id , @RequestBody User user) {
        System.out.println("update");
        userDao.update(id, user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
        userDao.delete(id);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }
}
