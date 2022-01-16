package src.service;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import src.dao.UserDao;
import src.model.User;

import java.lang.reflect.Array;
import java.util.List;


@Service
@Transactional
public class UserServiceImp implements UserService, InitializingBean {

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
   public void detele(User user) {
      userDao.delete(user);
   }

   @Override
   public void update(User user) {
      userDao.update(user);
   }


   @Override
   public void afterPropertiesSet() throws Exception {
//      User[] users=new User[] {
//              new User("Ivan", "Ivanov", "89537008209", "Ivan@mail.ru"),
//              new User("Petr", "Petrov", "89997008209", "Petr@mail.ru")
//      };
//      add(users[0]);
//      add(users[1]);
   }
}
