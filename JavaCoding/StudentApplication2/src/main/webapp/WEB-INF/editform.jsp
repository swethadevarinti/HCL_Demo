<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>

<body>

	<jsp:include page="/WEB-INF/welcome.jsp" />
	<br>
	<br>
	<br>
	<br>
	<br>
	<form method="post" action="update">

		<table align="center">

			<tr>
				<td>Employee Id</td>
				<td>${std.empId}</td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name="eName" value="${std.empName}"></td>

			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="eEmail" value="${std.empEmail}"></td>

			</tr>
			<tr>
				<td>Contact Details</td>
				<td><input type="text" name="eCell" value="${std.empContactDetails}"></td>

			</tr>
			
			<tr>
				<td>Designation</td>
				<td><input type="text" name="eDes" value="${std.empDesignation}"></td>

			</tr>
			

			<tr>

				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
		<input type="hidden" name="eId" value="${std.empId}">
	</form>

</body>

</html>