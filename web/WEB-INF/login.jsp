<%-- 
    Document   : login
    Created on : Aug 15, 2021, 8:42:58 PM
    Author     : 809562
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form method="post" action="login">
            <strong>Username:<input type="text" name="usernameUserJB"  value="${usernameUserJB}"><br></strong>   
            <strong>Password: <input type="text" name="passwordUserJB"  value="${passwordUserJB}"><br></strong> 
            
            <input type="submit" value="Log in" >
        </form>
        
    </body>
</html>