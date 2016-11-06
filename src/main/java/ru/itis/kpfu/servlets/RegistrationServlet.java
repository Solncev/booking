package ru.itis.kpfu.servlets;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import ru.itis.kpfu.configs.ConfigSingleton;
import ru.itis.kpfu.entities.User;
import ru.itis.kpfu.helpers.PasswordHasher;
import ru.itis.kpfu.services.UserService;
import ru.itis.kpfu.servicesimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Марат on 04.11.2016.
 */
@WebServlet(name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String hash = PasswordHasher.getMD5Digest(request.getParameter("password"));
        User user = new User(request.getParameter("email"),
                request.getParameter("login"),
                request.getParameter("password"),
                request.getParameter("firstname"),
                request.getParameter("surname"));

        if (user != null) {
            userService.addUser(user);
            if (userService.getClientByUsername(request.getParameter("login")) != null) {
                request.getSession().setAttribute("current_user", null);
                Cookie cookie = new Cookie("login", request.getParameter("login"));
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                response.sendRedirect("/login");
            }
        } else {
            response.sendRedirect("/registration");
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Configuration cfg = ConfigSingleton.getConfig(request.getServletContext());
        Template tmpl = cfg.getTemplate("registration.ftl");
        try {
            tmpl.process(null, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
