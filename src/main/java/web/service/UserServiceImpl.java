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
    public User addUser() {
        return userDao.addUser();
    }

    @Override
    public void refactorUser(User user) {
userDao.refactorUser(user);
    }

    @Override
    public String deleteUser() {
        return userDao.deleteUser();
    }
}
