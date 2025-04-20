<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>글 상세보기</title>
</head>
<body>
<h2>${article.title}</h2>
<p>작성자: ${article.user.nickname}</p>
<p>작성일: ${article.created_at}</p>
<p>조회수: ${article.view_cnt}</p>
<p>${article.content}</p>
<c:if test="${not empty article.file}">
    <p>첨부파일: <a href="/files/download?id=${article.file.id}">${article.file.originfile}</a></p>
</c:if>
<a href="/board/list">목록으로</a>
</body>
</html>