package src.service;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import src.dao.UserDao;
import src.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;


   @Override
   public void add(User user) {
      userDao.add(user);
   }


   @Override
   public List<User> listUsers() {
      return userDao.getAllUsers();
   }

   @Override
   public void deteleById(long id) {
      userDao.deleteById(id);
   }

   @Override
   public void update(long id, User userUpdater) {

      userDao.update(id, userUpdater);
   }

   @Override
   public User getUserById(long id){
      return userDao.getUserById(id);
   }




}
