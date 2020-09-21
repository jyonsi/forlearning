<#include "../common/header.ftl"/>
    <table border="1" width="100%">
        <tr>
            <td>学生编号</td>
            <td>学生姓名</td>
            <td>学生性别</td>
            <td>出生日期</td>
            <td>身高（cm）</td>
            <td>体重（kg）</td>
            <td>所在班级</td>
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
<#include "../common/header.ftl"/>
