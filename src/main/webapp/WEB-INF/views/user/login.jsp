<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<h2>로그인</h2>
<c:if test="${not empty msg}">
    <p style="color:red">${msg}</p>
</c:if>
<form method="post" action="/user/login">
    <input type="text" name="username" placeholder="아이디" required />
    <input type="password" name="password" placeholder="비밀번호" required />
    <button type="submit">로그인</button>
</form>
</body>
</html>