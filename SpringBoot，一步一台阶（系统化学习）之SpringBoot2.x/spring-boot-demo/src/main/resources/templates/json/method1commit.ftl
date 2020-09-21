<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>json数据的发送和接收</title>
    <script type="text/javascript" src="${ctx.contextPath}/js/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#jsonbtn").click(function () {
                $.ajax({
                    url:"${ctx.contextPath}/json/method1",
                    data:'{"studentName":"王小二","studentSex":"1","birthday":"1999-09-09","height":"178","weight":"75","classId":"1"}',
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
    <input type="button" id="jsonbtn" value="json数据的发送和接收"/>
<#include "../common/footer.ftl"/>
