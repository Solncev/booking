package ru.itis.kpfu.repositories;

import ru.itis.kpfu.entities.User;

import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public interface UserRepository {
    void addUser(User user);

    void removeUser(User user);

    void updateUser(User user);

    List<User> getUsers();

    User getUserByUsername(String username);
}
