<%-- 
    Document   : home
    Created on : Aug 15, 2021, 8:43:13 PM
    Author     : 809562
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>

        <h1>Home Page</h1>
        <p>${usernameHomeServletSession}  ${passwordHomeServletSession}</p>
        <a href ="login?logout" > Logout</a>
    
        </body>
</html>
