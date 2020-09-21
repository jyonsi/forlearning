<#include "../common/header.ftl"/>
    <form method="post"
          action="${ctx.contextPath}/parameter/method4">
        学生姓名：<input type="text" name="studentName"/><br/>
        学生性别：<input type="text" name="studentSex"/><br/>
        出生日期：<input type="text" name="birthday"/><br/>
        学生身高：<input type="text" name="height"/><br/>
        学生体重：<input type="text" name="weight"/><br/>
        所在班级：<input type="text" name="classId"/><br/>
        <input type="submit" value="提交保存"/>
    </form>
<#include "../common/footer.ftl"/>
