<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Json method4</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#jsoncommit").click(function () {
                $.ajax({
                    url:"${pageContext.request.contextPath}/json/method4.action",
                    data:'{"name":"风清扬","sex":"男","age":60,"height":180,"weight":69}',
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
    <input type="button" id="jsoncommit" value="发送和接受json数据"/>
</body>
</html>
