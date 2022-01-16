package src.dao;

import org.springframework.stereotype.Repository;
import src.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager manager;

    @Override
    public List<User> getAllUsers() {
        return manager.createQuery("SELECT u FROM User u").getResultList();
    }

    @Override
    public void deleteById(long id) {
        manager.createQuery("DELETE FROM User u WHERE u.id = :id")
                .setParameter("id", id).executeUpdate();
    }

    @Override
    public void add(User user){
        manager.persist(user);
    }

    @Override
    public void update(long id, User userUpdater) {
        User user = getUserById(id);
        user.setMail(userUpdater.getMail());
        user.setName(userUpdater.getName());
        user.setSecondName(userUpdater.getSecondName());
        user.setNumber(userUpdater.getNumber());
        manager.merge(user);
    }

    @Override
    public User getUserById(long id){
        List<User> list = manager.createQuery("SELECT u FROM User u WHERE u.id =:id")
                .setParameter("id", id).getResultList();
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

}
