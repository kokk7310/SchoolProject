 <%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<p>수강신청 조회</p>
<table border=1>
		<tr>
			<td  align=center>수강년도</td>
			<td  align=center>학기 </td>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
			
		</tr>
		<c:forEach var="schoolAppliedSubject" items="${schoolAppliedSubjectList}">
			<tr>
				<td><c:out value="${schoolAppliedSubject.year}"></c:out></td>
				<td><c:out value="${schoolAppliedSubject.semester}"></c:out></td>
				<td><c:out value="${schoolAppliedSubject.subjectCode}"></c:out></td>
				<td><c:out value="${schoolAppliedSubject.subject}"></c:out></td>
				<td><c:out value="${schoolAppliedSubject.partition}"></c:out></td>
				<td><c:out value="${schoolAppliedSubject.score}"></c:out></td>				
			</tr>
		</c:forEach>
	</table>
</body>
</html>