<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach items="${books}" var="book">
			<tr>
				<td><c:out value="${book.name}" /></td>
				<td><c:out value="${book.price}" /></td>
				<td><c:out value="${book.author}" /></td>
			</tr>
		</c:forEach>
	</table>
<c:if test="${fn:length(books) le 0}}">
	<p>Books not found</p>
</c:if>
</body>
</html>