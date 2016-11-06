package ru.javarush.crud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.javarush.crud.entity.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    // Inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getUsers() {

        // Get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Create a query sorted by name
        Query<User> query = currentSession.createQuery("from User order by name", User.class);

        // Execute query and get result list
        List<User> users = query.getResultList();

        // Return the results
        return users;
    }

}
