<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload method1</title>
</head>
<body>
    文件上传成功页面！！
    <hr/>
    兵器图片：<img src="${pageContext.request.contextPath}/uploadfiles/${weapon.imagePath}" width="400px" height="300px"/><br/>
    兵器名称：${weapon.name}<br/>
    兵器材料：${weapon.material}
</body>
</html>
