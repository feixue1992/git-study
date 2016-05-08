package com.lzh.spring.dao;

import com.lzh.spring.domain.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lzh on 2016/5/2.
 */
@Repository
public class UserDao {
    private Map<Integer, User> users = new HashMap<Integer, User>();

    @PostConstruct
    public void setup() {
        users.put(1, new User(1, "lzh"));
        users.put(2, new User(2, "chp"));
    }

    public void save(User user) {
        users.put(user.getId(), user);
    }

    public List<User> findAll() {
        return new ArrayList<User>(users.values());
    }

    public User  find(int id) {
        return users.get(id);
    }

    public void delete(int id) {
        users.remove(id);
    }

    public void update(int id, User user) {
        users.put(id, user);
    }
}
