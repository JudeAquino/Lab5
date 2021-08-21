  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        String username = (String) session.getAttribute("usernameUserJB");
            
        if (logout != null) {
           session.invalidate();
           request.setAttribute("message", "User successfully logged out");
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
        }
        
        if (username != null) {
            session.setAttribute("username", username);
            response.sendRedirect("home");
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
        }
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        AccountService accountService = new AccountService();
        
        String username = request.getParameter("usernameJSP");
        String password = request.getParameter("passwordJSP");
        
        User user = accountService.login(username, password);
        
        if (!username.isEmpty() && !password.isEmpty()) {
            user = accountService.login(username, password);
        }
        
        if (user != null) {
            session.setAttribute("usernameSessionLoginServlet", username);
            session.setAttribute("passwordSessionLoginServlet", password);
            response.sendRedirect("home");
        } else {
            request.setAttribute("message", "Incorrect user or password. Please try again.");
            request.setAttribute("username", username);
            request.setAttribute("passwordJSP", password);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}