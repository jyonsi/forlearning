<#include "../common/header.ftl"/>
    <form method="post"
          action="${ctx.contextPath}/fileupload/method1"
          enctype="multipart/form-data">
        图片：<input type="file" name="image"/><br/>
        名称：<input type="text" name="weaponName"/><br/>
        材料：<input type="text" name="material"/><br/>
        <input type="submit" value="提交"/>
    </form>
<#include "../common/footer.ftl"/>


