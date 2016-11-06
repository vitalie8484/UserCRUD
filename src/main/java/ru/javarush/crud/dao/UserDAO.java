package ru.javarush.crud.dao;

import ru.javarush.crud.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> getUsers();

    public void saveUser(User user);

    public User getUser(int userId);

    public void deleteUser(int userId);

}
