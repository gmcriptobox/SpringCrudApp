package src.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import src.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


@Repository
public class UserMySqlUserDao implements UserDao {

    @Autowired
    EntityManagerFactory managerFactory;

    @Override
    public List<User> getAllUsers() {
        return managerFactory.createEntityManager().createQuery("SELECT u FROM User u").getResultList();
    }

    @Override
    public void delete(User user) {
        managerFactory.createEntityManager().remove(user);
    }

    @Override
    public void add(User user){
        managerFactory.createEntityManager().persist(user);
    }

    @Override
    public void update(User user) {
        managerFactory.createEntityManager().merge(user);
    }
}
