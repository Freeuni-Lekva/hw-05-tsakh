package controller;

import model.AccountManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatingAccountsServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AccountManager manager = (AccountManager) getServletContext().getAttribute(AccountManager.attribute);
        String userName = request.getParameter("username");
        request.setAttribute("username", userName);
        if(manager.isUsernameInBase(userName)){
            request.getRequestDispatcher("/WEB-INF/nameInUse.jsp").forward(request, response);
            return;
        }
        String password = request.getParameter("password");
        manager.addNewAccount(userName, password);
        request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/creating.jsp").forward(request, response);
    }
}
