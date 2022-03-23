<%@ page isELIgnored="false"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form modelAttribute="uploadform" enctype="multipart/form-data">
<br><br><br><br><br><br>
<h1 align="center">Upload Files</h1>
<table style="text-align:center;">
<tr>
<td>Enter Name</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Select File</td>
<td><input type="file" name="uploaddoc"/></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
<tr>
<td>${uploadstatus}</td>
</tr>
</table>
</form:form>