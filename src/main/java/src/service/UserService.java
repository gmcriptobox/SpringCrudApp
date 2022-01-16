package src.service;



import src.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void detele(User user);
    void update(User user);
}
