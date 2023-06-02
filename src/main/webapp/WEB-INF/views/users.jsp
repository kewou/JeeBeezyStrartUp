<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>
	<h1>Liste des users</h1>
    <ul>
    <c:forEach var="user" items="${userList}">
        <li>${user.name}</li>
        <li>${user.email}</li>
        <!-- ... -->
    </c:forEach>
    </ul>
</body>
</html>