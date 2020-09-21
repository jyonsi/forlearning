<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Json method6</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/serializeJson.js"></script>
    <script type="text/javascript">

        $(function () {
            $("#jsoncommit").click(function () {

                alert($("#jsonform").serializeJson());

                $.ajax({
                    url:"${pageContext.request.contextPath}/json/method6.action",
                    data:$("#jsonform").serializeJson(),
                    contentType:"application/json",
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(JSON.stringify(data));
                    }
                });
            });
        });
    </script>
</head>
<body>
    <form id="jsonform">
        姓名：<input type="text" id="name" name="name"/><br/>
        性别：<input type="text" id="sex" name="sex"/><br/>
        年龄：<input type="text" id="age" name="age"/><br/>
        身高：<input type="text" id="height" name="height"/><br/>
        体重：<input type="text" id="weight" name="weight"/><br/>
    </form>
    <input type="button" id="jsoncommit" value="提交"/>
</body>
</html>
