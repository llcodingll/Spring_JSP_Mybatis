<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>게시판 목록</title>
</head>
<body>
<h2>게시판 목록</h2>
<a href="/board/write">글쓰기</a>
<table border="1">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>조회수</th>
        <th>작성일</th>
    </tr>
    <c:forEach var="article" items="${articles}">
        <tr>
            <td>${article.id}</td>
            <td><a href="/board/view?id=${article.id}">${article.title}</a></td>
            <td>${article.user.nickname}</td>
            <td>${article.view_cnt}</td>
            <td>${article.created_at}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
