<#include "../common/header.ftl"/>
    <form method="post"
          action="${ctx.contextPath}/validator/method4">

        昵称：<input type="text"
                  name="nick"
                  required="required"
                  placeholder="4~10个汉字"/><br/>

        密码：<input type="password"
                  name="password"
                  required="required"
                  placeholder="3~10个数字、字母或下划线（_）"/><br/>

        姓名：<input type="text"
                  name="name"
                  required="required"
                  placeholder="2~4个汉字"/><br/>

        手机：<input type="text"
                  name="telephone"
                  required="required"
                  placeholder="请输入正确的手机号码"/><br/>

        邮箱：<input type="text"
                  name="email"
                  required="required"
                  placeholder="请输入正确的邮箱格式"/><br/>

        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>

    </form>
<#include "../common/footer.ftl"/>

