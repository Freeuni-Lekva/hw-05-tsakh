package controller;

import model.AccountManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AccountManager manager = (AccountManager) getServletContext().getAttribute(AccountManager.attribute);
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        request.setAttribute("username", userName);
        if(manager.isValidLogin(userName, password)){
            request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);
            return;
        }
        request.getRequestDispatcher("/WEB-INF/tryAgain.jsp").forward(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/homepage.jsp").forward(request, response);
    }
}
