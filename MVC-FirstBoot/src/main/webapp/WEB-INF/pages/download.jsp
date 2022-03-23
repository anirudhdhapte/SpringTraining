<%@ page isELIgnored="false"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<br><br><br>
<table style="text-align:center;" border=1>
<tr><th>Name</th>
<th>File</th>
</tr>
<c:forEach var="file" items="${filedetails}">
<tr>
<td>${file.name}</td>
<td><a href="download?path=${file.path}">${file.path}</a></td>
</tr>
</c:forEach>
</table>