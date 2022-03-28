<%@ page isELIgnored="false"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<br><br><br>
<table style="text-align:center;" border=1>
<tr><th>Employee No</th>
<th>Employee Name</th>
<th>Salary</th>
<th colspan="2">Operation</th>
</tr>
<c:forEach var="emp" items="${empdetails}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.sal}</td>
<td><a href="edit?no=${emp.empno}">Edit</a></td>
<td><a href="delete?no=${emp.empno}">Delete</a></td>
</tr>
</c:forEach>
</table>