<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Employee Details</title>
</head>

<body >
	
	<jsp:include page="/WEB-INF/welcome.jsp" />
	
	<br>
	<br>
	<br>
	<br>
	<br> 
	<table align="center" border="2">
		<tr>
			<td>Employee Id</td> 
			<td>Name</td>
			<td>Email</td>
			<td>Contact Details</td>
			<td>Designation</td>
		</tr>
		<tr>
			<td>${emp.empId}</td>
			<td>${emp.empName}</td>
			<td>${emp.empEmail}</td>
			<td>${emp.empContactDetails}</td>
			<td>${emp.empDesignation}</td>
		</tr>
	</table>
</body>
</html>