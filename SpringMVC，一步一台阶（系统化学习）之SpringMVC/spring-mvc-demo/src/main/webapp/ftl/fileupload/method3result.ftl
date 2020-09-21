<#assign base=request.contextPath/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>File upload method3 FreeMarker!!</title>
</head>
<body>
    文件上传成功页面！！
    <hr/>
    兵器图片：
    <#list filePathList as filePath>
        <img src="${base}/uploadfiles/${filePath}" width="200px" height="150px"/><br/>
    </#list>
    兵器名称：${weapon.name}<br/>
    兵器材料：${weapon.material}
</body>
</html>
