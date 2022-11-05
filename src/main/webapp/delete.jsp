<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DeleteEmployee">
Employee id: <input type="text" value=<%=request.getParameter("id")%> name="empno" readonly>
<input type="submit" value="Delete">
</form>
</body>
</html>