<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="/js/script.js"></script>
<h3>Write Form page</h3>
<hr>
<table width="500" cellpadding="0" cellspacing="0" border="1">
    <form action="write" method="post">
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer" id="writer" size="100"></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title" id="title" size="100"></td>
        </tr>
        <tr>
            <td>내용</td>
            <td><input type="text" name="content" id="content" size="100"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" onclick="return inputCheck()" value="입력">
                <a href="list">목록보기</a>
            </td>
        </tr>

    </form>
</table>
</body>
</html>