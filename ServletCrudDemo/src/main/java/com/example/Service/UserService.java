package com.example.Service;

import com.example.Model.User;
import java.util.Map;
import java.util.HashMap;


public class UserService {
    private Map<Integer, User> userMap;

    public UserService() {
        userMap = new HashMap<>();
    }

    public User addUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    public User getUser(int id) {
        return userMap.get(id);
    }

    public void updateUser(User user) {
        if (userMap.containsKey(user.getId())) {
            userMap.put(user.getId(), user);
        }
    }

    public void deleteUser(int id) {
        userMap.remove(id);
    }
    public Map<Integer, User> getAllUsers() {
        return userMap;
    }
}
