<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Please enter the user information

<form:form method="POST" action="/biometric-1/addUser" modelAttribute="userDetail">
   <table>
    <tr>
        <td><form:label path="user_id">UserId</form:label></td>
        <td><form:input path="user_id" /></td>
    </tr>
    <tr>
        <td><form:label path="firstName">First Name</form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="fingerPrint">Scanner fingerPrint</form:label></td>
        <td><form:input path="fingerPrint" /></td>
    </tr>
    <tr>
        <td><form:label path="phonenumber">Phone number</form:label></td>
        <td><form:input path="phonenumber" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>




</body>
</html>