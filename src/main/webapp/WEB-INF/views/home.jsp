 <%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<p> <a href="${pageContext.request.contextPath}/scoreCheck">1.학기별 이수 학점 조회</a>
<p> <a href="${pageContext.request.contextPath}/perPartition">2.이수 구분별 학점 조회</a>
<p> <a href="${pageContext.request.contextPath}/applySubjectHome">3.수강신청하기</a>
<p> <a href="${pageContext.request.contextPath}/checkAppliedSubject">4.수강신청조회 </a>

</body>
</html>
