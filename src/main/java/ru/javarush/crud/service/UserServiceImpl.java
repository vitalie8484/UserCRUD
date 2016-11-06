package ru.javarush.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javarush.crud.dao.UserDAO;
import ru.javarush.crud.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // Inject User dao
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

}
