package ru.itis.kpfu.entities;

/**
 * Created by Liia on 30.10.2016.
 */
public class User {
    private Long id;
    private String email;
    private String login;
    private String password;
    private String name;
    private String surname;

    public User(Long id, String email, String login, String password, String name, String surname) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User(String email, String login, String password, String name, String surname) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
