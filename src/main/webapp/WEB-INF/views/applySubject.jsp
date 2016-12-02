 <%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
2017년도 1학기 수강신청
	<form methode="get"
		action="${pageContext.request.contextPath}/applySubject">
		<table>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td>SubjectCode</td>
				<td><input name="subjectCode" type="text" /></td>
			</tr>
			<tr>
				<td>Subject Name</td>
				<td><input name="subject" type="text" /></td>
			</tr>
			<tr>
				<td>Partition</td>
				<td><input name="partition" type="text" /></td>
			</tr>
			<tr>
				<td>Score</td>
				<td><input name="score" type="text" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Apply Subject" type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>