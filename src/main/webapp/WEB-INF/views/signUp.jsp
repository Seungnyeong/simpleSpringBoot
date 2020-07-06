<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<body>
<form action="/member" method="POST">
    <div>
        <input id="user_name" name="uid" type="text"/>
        <label for="user_name">username</label>
    </div>

    <div>
        <input id="email" name="uemail" type="email"/>
        <label for="email">email</label>
    </div>

    <div>
        <input id="password" name="upw" type="password"/>
        <label for="password">password</label>
    </div>
    <input type="submit" value="signup"/>
</form>
</body>
</html>
