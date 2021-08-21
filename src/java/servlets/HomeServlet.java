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

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
       String usernameHomeServlet = 
               (String)session.getAttribute("usernameUserJB");
       session.setAttribute(usernameHomeServlet, request);
       
       if (usernameHomeServlet==null) {
           getServletContext().getRequestDispatcher("/WEB-INF/home").forward(request, response);
       }
       else  {
                response.sendRedirect("login");
            }
       
       
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
       .forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
}
