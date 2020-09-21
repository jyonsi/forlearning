<#include "../common/header.ftl"/>
    <#list uploadFileNameList as uploadFileName>
        图片${uploadFileName_index+1}：<img src="${ctx.contextPath}/fileupload/showPicture?fileName=${uploadFileName}"
                width="200px" height="150px"/><br/>
    </#list>
    名称：${weapon.weaponName}<br/>
    材料：${weapon.material}
<#include "../common/footer.ftl"/>


