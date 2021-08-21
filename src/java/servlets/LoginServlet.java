/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
        .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      HttpSession session = request.getSession();
      
        AccountService aService = new AccountService();
        User user = new User();
        
        String usernameServlet=request.getParameter("usernameUserJB");
        String passwordServlet=request.getParameter("passwordUserJB");
        
        request.setAttribute("usernameUserJB", usernameServlet);
        request.setAttribute("passwordUserJB", passwordServlet);
                if(usernameServlet.equals("")|| passwordServlet.equals("")){
         getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
               .forward(request, response);
        }
        

                
        if (user != null) {
            session.setAttribute("usernameUserJB", usernameServlet);
            session.setAttribute("passwordUserJB", passwordServlet);
            response.sendRedirect("home");
        } else {
            request.setAttribute("message", "Incorrect username or password.");
            session.setAttribute("usernameUserJB", usernameServlet);
            session.setAttribute("passwordUserJB", passwordServlet);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);
        }
            



         getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
        .forward(request,response);
        
    }
}




