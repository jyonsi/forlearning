<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameter method4</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/parameter/method4.action" method="post">
        姓名：<input type="text" id="name" name="name"/><br/>
        性别：<input type="text" id="sex" name="sex"/><br/>
        年龄：<input type="text" id="age" name="age"/><br/>
        身高：<input type="text" id="height" name="height"/><br/>
        体重：<input type="text" id="weight" name="weight"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
