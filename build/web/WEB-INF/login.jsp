<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        ${message}
        <form action="login" method="post">
            <p><strong>Username: </strong><input type="text" name="usernameJSP" value="${usernameUserJB}"><br>
            <strong>Password: </strong><input type="password" name="passwordJSP" value="${passwordUserJB}"></p>
            <input type="submit" value="Log in">
        </form>
    </body>