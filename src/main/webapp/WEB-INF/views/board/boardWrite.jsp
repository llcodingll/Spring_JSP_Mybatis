<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>글쓰기</title>
</head>
<body>
<h2>글쓰기</h2>
<form action="/board/write" method="post" enctype="multipart/form-data">
    제목: <input type="text" name="title" /><br/>
    내용:<br/>
    <textarea name="content" rows="10" cols="50"></textarea><br/>
    파일: <input type="file" name="file" /><br/>
    <input type="submit" value="등록" />
</form>
</body>
</html>
