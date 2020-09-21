<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameter method1</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/parameter/method1.action" method="post">
        姓名：<input type="text" id="name" name="name"/><br/>
        性别：<input type="text" id="sex" name="sex"/><br/>
        年龄：<input type="text" id="age" name="age"/><br/>
        电话：<input type="text" id="phone" name="phone"/><br/>
        籍贯：<input type="text" id="nativePlace" name="nativePlace"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
