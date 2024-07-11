<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String name = "홍길동"; %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP View Page 인식하기 테스트</title>
</head>
<body>
	<div>
		<%out.println("Hello StringBoot JSP View");%>
	</div>
	<div><%=name %></div>
</body>
</html>