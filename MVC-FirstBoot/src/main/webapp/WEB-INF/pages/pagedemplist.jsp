<%@ page isELIgnored="false"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<br><br><br>
<table style="text-align:center;" border=1>
<tr><th>Employee No</th>
<th>Employee Name</th>
<th>Job</th>
<th>Salary</th>
<th colspan="2">Operation</th>
</tr>
<c:forEach var="emp" items="${empdetails.getContent()}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td><a href="edit?no=${emp.empno}">Edit</a></td>
<td><a href="delete?no=${emp.empno}">Delete</a></td>
</tr>
</c:forEach>
</table>
<c:forEach var="i" begin="0" end="${empdetails.getTotalPages()-1}">
<a href="pagedemplist?page=${i}">${i+1}</a>
</c:forEach>
<c:if test=${empdetails.isLast()}">
<a href="pagedemplist?page=${emplist.getNumber()+1}">Next</a>
</c:if>