package src.service;



import src.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUserById(long id);
    void deteleById(long id);
    void update(long id, User userUpdater);

}
