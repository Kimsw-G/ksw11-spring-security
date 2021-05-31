<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

<form action="/login" method="post">
    <input type="text" name="id">
    <input type="password" name="password">

    <input type="submit" value="로그인">
</form>
</body>
</html>