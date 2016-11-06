package ru.itis.kpfu.services;

import ru.itis.kpfu.entities.User;

/**
 * Created by Марат on 06.11.2016.
 */
public interface UserService {
    void addUser(User user);

    User getClientByUsername(String username);
}
