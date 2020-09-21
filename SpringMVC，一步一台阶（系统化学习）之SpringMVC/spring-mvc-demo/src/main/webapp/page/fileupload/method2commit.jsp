<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload method2</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/fileupload/method2.action"
          method="post"
          enctype="multipart/form-data">
        图片1：<input type="file" id="image1" name="image"/><br/>
        图片2：<input type="file" id="image2" name="image"/><br/>
        图片3：<input type="file" id="image3" name="image"/><br/>
        图片4：<input type="file" id="image4" name="image"/><br/>
        图片5：<input type="file" id="image5" name="image"/><br/>
        兵器名称：<input type="text" id="name" name="name"/><br/>
        兵器材料：<input type="text" id="material" name="material"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
