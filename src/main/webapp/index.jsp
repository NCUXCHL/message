<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>填写公告</h2>
<form action="${pageContext.request.contextPath}/announce">
    公告内容: <input type="text" name="content"> <br>
           <input type="submit" value="发布 ">
</form>
</body>
</html>
