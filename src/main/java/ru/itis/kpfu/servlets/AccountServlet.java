package ru.itis.kpfu.servlets;

import freemarker.template.Template;
import ru.itis.kpfu.configs.ConfigSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Марат on 06.11.2016.
 */
@WebServlet(name = "AccountServlet")
public class AccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Template tmpl = ConfigSingleton.getConfig(
                request.getServletContext()
        ).getTemplate("account.ftl");
    }
}
