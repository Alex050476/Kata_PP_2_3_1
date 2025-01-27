package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> usersList();
    User addUser();
    void refactorUser(User user);
    String deleteUser();
}
