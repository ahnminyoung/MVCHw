<%@page import="kr.ac.hansung.dao.Course"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>course</title>
<style>

</style>
</head>
<body>
	<table border="1">
      <tr><td>수강년도</td><td>학기</td><td>교과코드</td><td>교과목명</td><td>구분</td><td>학점</td></tr>
      <c:forEach var="details" items="${details }">
         <tr>
            <td><c:out value="${details.year }"></c:out></td>
            <td><c:out value="${details.semester }"></c:out></td>
            <td><c:out value="${details.code }"></c:out></td>
            <td><c:out value="${details.subject }"></c:out></td>
            <td><c:out value="${details.division }"></c:out></td>
            <td><c:out value="${details.marks }"></c:out></td>
         </tr>
      </c:forEach>
   </table>

</body>
</html>