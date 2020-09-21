<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>json数据的发送和接收</title>
    <script type="text/javascript" src="${ctx.contextPath}/js/jquery.js"></script>
    <script type="text/javascript">
        $.fn.serializeJson = function()
        {
            var obj = {};
            var array = this.serializeArray();
            $.each(array, function() {
                if (obj[this.name]) {
                    if (!obj[this.name].push) {
                        obj[this.name] = [obj[this.name]];
                    }
                    obj[this.name].push(this.value || '');
                } else {
                    obj[this.name] = this.value || '';
                }
            });
            //return obj;
            return JSON.stringify(obj);
        };

        $(function () {
            $("#jsonbtn").click(function () {
                $.ajax({
                    url:"${ctx.contextPath}/json/method2",
                    data:$("#jsonform").serializeJson(),
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
    <form id="jsonform">
        学生姓名：<input type="text" name="studentName"/><br/>
        学生性别：<input type="text" name="studentSex"/><br/>
        出生日期：<input type="text" name="birthday"/><br/>
        学生身高：<input type="text" name="height"/><br/>
        学生体重：<input type="text" name="weight"/><br/>
        所在班级：<input type="text" name="classId"/><br/>
        <input type="button" id="jsonbtn" value="表单数据发送和接收"/>
    </form>

<#include "../common/footer.ftl"/>
