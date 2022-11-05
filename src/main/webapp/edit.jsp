<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EditEmployee">
Employee id: <input type="text" value=<%=request.getParameter("id")%> name="empno" readonly><br>
Employee name: <input type="text" name="empname"><br>
Enter Email: <input type="text" name="empemail"><br>
Enter Age: <input type="text" name="age"><br>
<input type="submit">
</form>
</body>
</html>