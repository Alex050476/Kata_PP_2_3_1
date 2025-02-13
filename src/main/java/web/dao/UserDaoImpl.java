package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void refactorUser(int id, User userUpdate) {
        String newName = userUpdate.getName();
        String newNickName = userUpdate.getNickname();
        Query query = entityManager.createQuery("UPDATE User u SET u.name = :newName, u.nickname = :newNickName WHERE id= :id");
        query.setParameter("newName", newName);
        query.setParameter("newNickName", newNickName);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        Query query = entityManager.createQuery("DELETE from User u WHERE u.id= :id");
        query.setParameter("id", id);
        int c = query.executeUpdate();
        System.out.println(c);
    }

    @Override
    public List<User> usersList() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User show(int id) {
        TypedQuery<User> query = entityManager.createQuery("from User WHERE id= :id", User.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

}