package src.loader;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import src.model.User;
import src.service.UserService;

@Component
public class EntityLoader implements InitializingBean {

    @Autowired
    UserService userService;


    @Override
    @Transactional
    public void afterPropertiesSet() throws Exception {
        User[] users=new User[] {
                new User("Ivan", "Ivanov", "89537008209", "Ivan@mail.ru"),
                new User("Petr", "Petrov", "89997008209", "Petr@mail.ru")
           };
        userService.add(users[0]);
        userService.add(users[1]);
    }
}
