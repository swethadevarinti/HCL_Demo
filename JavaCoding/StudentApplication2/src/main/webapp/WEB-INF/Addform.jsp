
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>

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
	<form method="post" action="add">

		<table align="center">

			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="eId"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="eName"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="eEmail"></td>
			</tr>
			<tr>
				<td>Contact Details</td>
				<td><input type="text" name="eCell"></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="eDes"></td>
			</tr>

	 <tr>  <td><input type="submit" value="ADD"/></td>  </tr>  </table>  </form>  </body> </html>