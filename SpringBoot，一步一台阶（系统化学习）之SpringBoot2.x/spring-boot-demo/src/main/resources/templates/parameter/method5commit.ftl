<#include "../common/header.ftl"/>
    <form method="post"
          action="${ctx.contextPath}/parameter/method5">
        学生姓名：<input type="text" name="student.studentName"/><br/>
        学生性别：<input type="text" name="student.studentSex"/><br/>
        出生日期：<input type="text" name="student.birthday"/><br/>
        学生身高：<input type="text" name="student.height"/><br/>
        学生体重：<input type="text" name="student.weight"/><br/>
        所在班级：<input type="text" name="student.classId"/><br/>
        宠物名称：<input type="text" name="pet.petName"/><br/>
        宠物颜色：<input type="text" name="pet.color"/><br/>
        <input type="submit" value="提交保存"/>
    </form>
<#include "../common/footer.ftl"/>
