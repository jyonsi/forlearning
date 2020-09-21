<#include "../common/header.ftl"/>
    <form method="post"
          action="${ctx.contextPath}/validator/method1">

        昵称：<input type="text"
                  name="nick"
                  pattern="[\u4e00-\u9fa5]{4,10}"
                  required="required"
                  placeholder="4~10个汉字"/><br/>

        密码：<input type="password"
                  name="password"
                  pattern="\w{3,10}"
                  required="required"
                  placeholder="3~10个数字、字母或下划线（_）"/><br/>

        姓名：<input type="text"
                  name="name"
                  pattern="[\u4e00-\u9fa5]{2,4}"
                  required="required"
                  placeholder="2~4个汉字"/><br/>

        手机：<input type="text"
                  name="telephone"
                  pattern="0?(13|14|15|17|18)[0-9]{9}"
                  required="required"
                  placeholder="请输入正确的手机号码"/><br/>

        邮箱：<input type="text"
                  name="email"
                  pattern="\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}"
                  required="required"
                  placeholder="请输入正确的邮箱格式"/><br/>

        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>

    </form>
<#include "../common/footer.ftl"/>

