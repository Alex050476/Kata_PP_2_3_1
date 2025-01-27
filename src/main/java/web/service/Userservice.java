package web.service;

import web.models.User;

import java.util.List;

public interface Userservice {
    List<User> usersList();
    User addUser();
    void refactorUser(User user);
    String deleteUser();
}
