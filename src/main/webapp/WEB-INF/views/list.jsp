<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
    <title>Title</title>
</head>
<body>
<h3>List Page</h3>
<img src="/images/book.png">
<hr>
<table width="500" cellpadding="0" cellspacing="0" border="1">
    <tr>
        <td>번호</td><td>작성자</td><td>제목</td><td>내용</td>
    </tr>
    <c:forEach var="l" items="${list}">
        <tr>
            <td>${l.id}</td><td>${l.writer}</td><td><a href="view/?id=${l.id}">${l.title}</a></td><td>${l.content}</td>
            <td><a href="updateForm?id=${l.id}">변경</a></td>
            <td><a href="delete?id=${l.id}">삭제</a></td>
        </tr>
    </c:forEach>
</table>
<hr>
<a href="writeForm">글쓰기</a>
</body>
</html>