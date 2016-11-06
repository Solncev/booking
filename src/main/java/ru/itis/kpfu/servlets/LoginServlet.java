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
import java.io.PrintWriter;


/**
 * Created by Марат on 28.09.2016.
 */
@WebServlet(name = "ru.itis.kpfu.servlets.LoginServlet")
public class LoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String err = request.getParameter("err");
        String login = request.getParameter("login");
        Configuration cfg = ConfigSingleton.getConfig(request.getServletContext());
        Template tmpl = cfg.getTemplate("login.ftl");
        try {
            tmpl.process(null, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String login = request.getParameter("login");
        String password = PasswordHasher.getMD5Digest(request.getParameter("password"));
        User user = userService.getClientByUsername(login);
        PrintWriter printWriter = response.getWriter();

        if (user != null) {
            if (password.equals(user.getPassword())) {
                request.getSession().setAttribute("current_user", login);
                Cookie cookie = new Cookie("login", login);
                cookie.setMaxAge(60 * 60);
                response.addCookie(cookie);
                response.sendRedirect("/account");
            } else {
                response.sendRedirect("/login?err=Incorrect Password&login=" + login);
            }
        } else {
            response.sendRedirect("/login?err=Wrong Login&login=" + login);
        }
    }

}