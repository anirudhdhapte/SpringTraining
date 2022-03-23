<%@ page isELIgnored="false"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form modelAttribute="editform">
<br><br><br><br><br><br>
<table style="text-align:center;">
<tr>
<td>Employee Number</td>
<td><form:input path="empno"/></td>
</tr>
<tr>
<td>Employee Name</td>
<td><form:input path="ename"/></td>
</tr>
<tr>
<td>Employee Salary</td>
<td><form:input path="sal"/></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
</table>
</form:form>