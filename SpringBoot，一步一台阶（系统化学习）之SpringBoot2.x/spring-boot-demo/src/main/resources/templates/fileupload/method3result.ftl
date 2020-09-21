<#include "../common/header.ftl"/>
    <#if uploadFileNameList?exists>
    <#list uploadFileNameList as uploadFileName>
        图片${uploadFileName_index+1}：<img src="${ctx.contextPath}/fileupload/showPicture?fileName=${uploadFileName}"
                width="200px" height="150px"/><br/>
    </#list>
    </#if>
    名称：${weapon.weaponName?if_exists}<br/>
    材料：${weapon.material?if_exists}
<#include "../common/footer.ftl"/>


