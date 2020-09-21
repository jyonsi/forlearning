<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload method3 JSP</title>
</head>
<body>
    文件上传成功页面！！
    <hr/>
    兵器图片：
    <%
        List<String> filePathList = (List<String>) request.getAttribute("filePathList");
        for(String filePath:filePathList){%>
            <img src="${pageContext.request.contextPath}/uploadfiles/<%=filePath%>" width="200px" height="150px"/><br/>
      <%}%>

    兵器名称：${weapon.name}<br/>
    兵器材料：${weapon.material}
</body>
</html>
