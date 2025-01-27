package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    User user1 = new User("Ivan", "Durak");
    User user2 = new User("Tom", "Cat");
    User user3 = new User("Zaur", "Chack Norris");
    List<User> users = new ArrayList<>();
    {
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Override
    public User addUser() {
        return null;
    }

    @Override
    public void refactorUser(User user) {

    }

    @Override
    public String deleteUser() {
        return "";
    }

    @Override
    public List<User> usersList() {
        return users;
    }
}
