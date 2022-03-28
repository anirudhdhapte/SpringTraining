<%@ page isELIgnored="false"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form modelAttribute="loginform">
<br><br><br><br><br><br>
<h1 align="center">Login Page</h1>
<table style="text-align:center;">
<tr>
<td>Username</td>
<td><form:input path="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><form:input path="password"/></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
<tr style="size: 2cm;">
<td>${loginstatus}</td>
</tr>
</table>
</form:form>