<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validator method4</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/validator/method4.action"
          method="post">

        昵称：<input type="text"
                  id="nick"
                  name="nick"
                  required="required"
                  placeholder="4~10个汉字"/><br/>

        密码：<input type="text"
                  id="password"
                  name="password"
                  required="required"
                  placeholder="3~10个数字、字母或下划线（_）"/><br/>

        姓名：<input type="text"
                  id="name"
                  name="name"
                  required="required"
                  placeholder="2~4个汉字"/><br/>

        电话：<input type="text"
                  id="telephone"
                  name="telephone"
                  required="required"
                  placeholder="需要填写正确的电话号码格式"/><br/>

        邮件：<input type="text"
                  id="email"
                  name="email"
                  required="required"
                  placeholder="需要填写正确的电子邮件地址格式"/><br/>

        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</body>
</html>
