<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<html>
	<head>
	</head>
	<body>
	<h3>Payments</h3>
	<c:forEach items="${model.payments}" var="pay">
		<c:out value="${pay.amount}"/>
	</c:forEach>
	</body>
</html>