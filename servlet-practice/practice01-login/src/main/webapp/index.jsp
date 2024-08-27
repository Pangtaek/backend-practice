<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<div class="login-wrapper">
    <h2>Login(GET)</h2>
    <form method="GET" action="loginQueryString">
        <label>e-mail</label>
        <input type="text" name="userName" placeholder="Email">
        <br/>
        <label>password</label>
        <input type="password" name="userPassword" placeholder="Password">
        <br/>
        <input type="submit" value="Login">
    </form>
</div>

<div class="login-wrapper">
    <h2>Login(POST)</h2>
    <form method="POST" action="loginPost">
        <label>  e-mail  </label>
        <input type="text" name="userName" placeholder="Email">
        <br/>
        <label>password</label>
        <input type="password" name="userPassword" placeholder="Password">
        <br/>
        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>