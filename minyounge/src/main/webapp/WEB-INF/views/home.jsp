<%@page import="kr.ac.hansung.dao.Course"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>Home</title>
<style>

</style>
</head>
<body>
종합정보시스템
<table border="1">
      <tr><td>년도</td><td>학기</td><td>총학점</td><td>상세보기</td></tr>
      <c:forEach var="semesterList" items="${semesterList }">
         <tr>
            <td><c:out value="${semesterList.year }"></c:out></td>
            <td><c:out value="${semesterList.semester }"></c:out></td>
            <td><c:out value="${semesterList.marks }"></c:out></td>
            <td><a href="${pageContext.request.contextPath}/course?year=${semesterList.year}&semester=${semesterList.semester }">Click</a></td>
         </tr>
      </c:forEach>
   </table>
   <table border="1">
      <tr>
         <c:forEach var="divisionlist" items="${divisionlist }">
            <td><c:out value="${divisionlist.division }"></c:out></td>
         </c:forEach>   
         <td>총학점<td>
      </tr>   
      <tr>   
         <c:forEach var="divisionlist" items="${divisionlist }">
            <td><c:out value="${divisionlist.marks }"></c:out></td>
         </c:forEach>
         <td>${total}<td>
      </tr>   

   </table>
   
   
</body>
</html>