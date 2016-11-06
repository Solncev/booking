package ru.itis.kpfu.servicesimpl;

import ru.itis.kpfu.entities.User;
import ru.itis.kpfu.repositories.UserRepository;
import ru.itis.kpfu.repositoriesimpl.UserRepositoryImpl;
import ru.itis.kpfu.services.UserService;

/**
 * Created by Марат on 06.11.2016.
 */
public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepositoryImpl();

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public User getClientByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }
}
