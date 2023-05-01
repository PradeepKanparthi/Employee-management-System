<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee-Management-System</title>
</head>
<body>
      
       <f:form action="addEmployee" modelAttribute="employee">
             <f:input path="employeeName" placeholder="Enter Name:"/>
             <f:input path="employeePhNo" placeholder="Enter PhNo:"/>
             <input type="submit" value="Save">
       </f:form>
</body>
</html>