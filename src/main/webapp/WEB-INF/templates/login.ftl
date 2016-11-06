<#include "base.ftl">

<#macro content>
<a href="/registration">Log up</a>
<form method="post" action="login">
    <input type="text" name="login"
        <#if login?has_content>
           value="${login}"
        </#if>
    >

    <input type="password" name="password">

    <br>
    <#if err?has_content>
        <h3>${err}</h3>
    </#if>
    <br>
    <input type="submit" value="login">
</form>
</#macro>