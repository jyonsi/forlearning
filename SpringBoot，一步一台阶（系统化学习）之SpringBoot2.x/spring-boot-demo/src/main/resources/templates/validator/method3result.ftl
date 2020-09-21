<#include "../common/header.ftl"/>
    昵称：${customer.nick?if_exists}<br/>
    密码：${customer.password?if_exists}<br/>
    姓名：${customer.name?if_exists}<br/>
    手机：${customer.telephone?if_exists}<br/>
    邮箱：${customer.email?if_exists}
<#include "../common/footer.ftl"/>

