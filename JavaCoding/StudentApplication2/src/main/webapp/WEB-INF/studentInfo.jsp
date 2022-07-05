<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/WEB-INF/welcome.jsp" />
	
	<br>
	<br>
	<br>
	<br>
	<br> 
	
	 <table border="2" cellpadding="3">
                <tr>
                    <th>Employee ID</th>
                    <th> Name</th>
                    <th>Email</th>
                    <th>Contact Details</th>
                    <th>Designation</th>
                </tr>
                 
                <c:forEach items="${list}" var="a">
                 
                <tr>
                 
                    <td>${a.empId}
                        <input type="hidden" name="studentId1" value="${a.empId}" />
                    </td>
                    <td><input type="text" name="ename" value="${a.empName}"/></td>
                    <td><input type="text" name="email" value="${a.empEmail}"/></td>
                    <td><input type="text" name="cell" value="${a.empContactDetails}"/></td>
                    <td><input type="text" name="desg" value="${a.empDesignation}"/></td>
                </tr>
                 
                </c:forEach>  
                 
            </table>
</body>
</html>