<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR"> -->
<title>Insert title here</title>
</head>
<body>
<p>학년/학기별 이수 총 학점</p>
<table border=1>
		<tr align=center>
			<td  align=center>년도</td>
			<td  align=center>학기 </td>
			<td>이수 학점</td>
			<td>상세보기</td>
			
			
		</tr>
		<tr>
<c:forEach var="school" items="${schools}">
	<tr>
				<td><c:out value="${school.year}"></c:out></td>
				<td><c:out value="${school.semester}"></c:out></td>				
				<td><c:out value="${school.score}"></c:out></td>
				<td><a href="${pageContext.request.contextPath}/subjectList?year=${school.year}&semester=${school.semester}">링크 </a></td>				
			</tr>
		</c:forEach>
	</table>
	
<p> <a href="${pageContext.request.contextPath}/home">home으로 </a>
</body>
</html>