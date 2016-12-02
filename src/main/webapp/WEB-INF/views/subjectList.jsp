<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR"> -->
<title>Insert title here</title>
</head>
<body>
<p>과목별 리스트</p>
	<table border=1>
		<tr>
			<td>  교과목 리스트  </td>
		</tr>
		<c:forEach var="schoolSubject" items="${schoolSubjectList}">
			<tr>
				<td><c:out value="${schoolSubject.subject}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<p> <a href="${pageContext.request.contextPath}/scoreCheck">back </a>
</body>
</html>