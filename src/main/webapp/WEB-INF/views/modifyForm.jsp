<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Update Form page</h3>
<hr>
<table width="500" cellpadding="0" cellspacing="0" border="1">
    <form action="update" method="post">
        <input type="text" name="id" value="${dto.id}" hidden>
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer" size="100" value="${dto.writer}" readonly></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" size="100" value="${dto.title}"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="content" size="100" value="${dto.content}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="수정">
                <a href="list">목록보기</a>
            </td>
        </tr>

    </form>
</table>
</body>
</html>