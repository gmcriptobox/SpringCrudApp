package src.dao;

import src.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void delete(User user);
    void add(User user);
    void update(User user);
}
