<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.sgic.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> employees = (List<Employee>)request.getAttribute("employees");
for(Employee e: employees){
	out.println(e.getId());
	out.println(e.getName());
	out.println(e.getSalary());
}

%>

</body>
</html>