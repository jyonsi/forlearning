<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameter method3</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/parameter/method3.action" method="post">
        姓名：<input type="text" id="mname" name="mname"/><br/>
        性别：<input type="text" id="msex" name="msex"/><br/>
        年龄：<input type="text" id="mage" name="mage"/><br/>
        电话：<input type="text" id="mphone" name="mphone"/><br/>
        籍贯：<input type="text" id="mnativePlace" name="mnativePlace"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
