package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> usersList() {
        return userDao.usersList();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void refactorUser(int id, User userUpdate) {
        userDao.refactorUser(id, userUpdate);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }
}
