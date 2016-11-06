package ru.javarush.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javarush.crud.entity.User;
import ru.javarush.crud.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // Inject user service
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listUsers(Model model) {

        // Get users from the dao
        List<User> usersList = userService.getUsers();

        // Add users to the model
        model.addAttribute("users", usersList);

        return "list-users";
    }
}
