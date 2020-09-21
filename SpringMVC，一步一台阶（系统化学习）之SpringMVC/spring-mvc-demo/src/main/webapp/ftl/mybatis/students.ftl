<#assign base=request.contextPath/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生的列表页面</title>
</head>
<body>
    <table border="1px" width="100%">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>出生日期</td>
            <td>身高</td>
            <td>体重</td>
            <td>班级</td>
        </tr>
        <#list mybatisStudentTblList as student>
        <tr>
            <td>${student.studentId}</td>
            <td>${student.studentName}</td>
            <td><#if student.studentSex=1>男<#else>女</#if></td>
            <td>${student.birthday}</td>
            <td>${student.height}</td>
            <td>${student.weight}</td>
            <td>${student.classId}</td>
        </tr>
        </#list>
    </table>
</body>
</html>
