package web.service;

import web.models.User;
import java.util.List;

public interface Userservice {
    List<User> usersList();
    void addUser(User user);
    void refactorUser(int id, User userUpdate);
    void deleteUser(int id);
    User show(int id);
}
