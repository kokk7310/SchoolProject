<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR"> -->
<title>Insert title here</title>
</head>
<body>
<p>이수 구분별 학점 내역</p>
	<table border=1>

		<tr>
			<c:forEach var="schoolPerPartitionScore" items="${schools}">
				<td><c:out value="${schoolPerPartitionScore.partition}"></c:out></td>
			</c:forEach>
			<td>총학점</td>
		</tr>
		<tr>
			<c:forEach var="schoolPerPartitionScore" items="${schools}">
				<td><c:out value="${schoolPerPartitionScore.score}"></c:out></td>
			</c:forEach>
			<td><c:out value="${totalScore}"></c:out></td>
		</tr>
	</table>
</body>
</html>