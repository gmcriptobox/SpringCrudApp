package src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import src.service.UserService;


@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping()
    public String getAllUser(Model model){
        model.addAttribute("userList", userService.listUsers());
        return "user/users";
    }

//    @GetMapping("/{id}")
//    public String getUserForId(@PathVariable("id") int id, Model model){
//        //получение юзера по id из Repository
//        return null;
//    }
}
