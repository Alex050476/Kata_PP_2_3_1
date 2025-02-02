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
    public void addUser(User user) {
        if (user.getName() != null && user.getNickname() != null) {
            user.setId(User.getIdGenerator() + 1);
            User.setIdGenerator(user.getId());
            users.add(user);
        }
    }

    @Override
    public void refactorUser(int id, User userUpdate) {
        User toUpdate = show(id);
        toUpdate.setName(userUpdate.getName());
        toUpdate.setNickname(userUpdate.getNickname());
    }

    @Override
    public void deleteUser(int id) {
        User userToDelete = show(id);
        users.remove(userToDelete);
        //users.removeIf(u -> u.getId() == id);
    }

    @Override
    public List<User> usersList() {
        return users;
    }

    @Override
    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
