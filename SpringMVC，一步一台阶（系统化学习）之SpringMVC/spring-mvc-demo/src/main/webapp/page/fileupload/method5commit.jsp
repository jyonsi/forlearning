<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload method4</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#ajaxFormButton").click(function () {
                $("#ajaxForm").ajaxSubmit({
                    url:"${pageContext.request.contextPath}/fileupload/method5.action",
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
    <form id="ajaxForm" enctype="multipart/form-data">
        图片：<input type="file" id="image1" name="image" multiple="multiple"/><br/>
        兵器名称：<input type="text" id="name" name="name"/><br/>
        兵器材料：<input type="text" id="material" name="material"/><br/>
        <input type="button" id="ajaxFormButton" value="提交"/>
    </form>
</body>
</html>
