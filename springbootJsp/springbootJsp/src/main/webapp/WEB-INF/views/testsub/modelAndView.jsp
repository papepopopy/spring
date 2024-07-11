<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회</title>
</head>
<body>
	<div class="container">
		${jdbcMembers }
		<table class="table">
			<c:forEach var="member" items = "${jdbcMembers }">
				<tr><td>${member.name}</td></tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>