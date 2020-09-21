<#assign base=request.contextPath/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>File upload method3</title>
</head>
<body>
    <form action="${base}/fileupload/method3.action"
          method="post"
          enctype="multipart/form-data">
        图片：<input type="file" id="image1" name="image" multiple="multiple"/><br/>
        兵器名称：<input type="text" id="name" name="name"/><br/>
        兵器材料：<input type="text" id="material" name="material"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
