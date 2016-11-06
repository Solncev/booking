<#include "base.ftl">

<#macro content>
<form method="post" action="registration">
    <input type="text" name="login"
        <#if login?has_content>
           value="${login}"
        </#if>
    >
    <br>
    <input type="text" name="email">
    <br>
    <input type="password" name="password">
    <br>
    <input type="text" name="firstname">
    <br>
    <input type="text" name="surname">
    <br>



<#--<br>-->
<#--<#if err?has_content>-->
<#--<h3>${err}</h3>-->
<#--</#if>-->
<#--<br>-->
    <br>
    <input type="submit" value="log up">
</form>
</#macro>