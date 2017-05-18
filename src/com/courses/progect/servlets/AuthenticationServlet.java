package com.courses.progect.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Irina Petrova on 18.05.2017.
 */
public class AuthenticationServlet extends HttpServlet {

    private static final String LOGIN_NAME_PARAMETR = "login";
    private static final String PASSWORD_NAME_PARAMETR = "password";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String login = (String) request.getParameter(LOGIN_NAME_PARAMETR);
        login = login.toUpperCase();
        String password = (String) request.getParameter(PASSWORD_NAME_PARAMETR);
        password = password.toUpperCase();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<!DOCTYPE HTML>");
        response.getWriter().println("<html><body><p>" + login + "</p></body></html>");
        response.getWriter().println("<html><body><p>" + password + "</p></body></html>");
}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
