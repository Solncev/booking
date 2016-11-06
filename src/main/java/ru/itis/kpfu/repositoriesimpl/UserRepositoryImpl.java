package ru.itis.kpfu.repositoriesimpl;

import ru.itis.kpfu.entities.User;
import ru.itis.kpfu.helpers.DBConnectionHelper;
import ru.itis.kpfu.repositories.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Марат on 06.11.2016.
 */
public class UserRepositoryImpl implements UserRepository {
    Connection connection = DBConnectionHelper.getConnection();
    User user = null;

    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(email, login, password, firstname, surname) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getName());
            preparedStatement.setString(5, user.getSurname());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUser(User user) {

    }

    public void updateUser(User user) {

    }

    public List<User> getUsers() {
        return null;
    }

    public User getUserByUsername(String username) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE login = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("email"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("firstname"),
                        resultSet.getString("surname")
                );
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
