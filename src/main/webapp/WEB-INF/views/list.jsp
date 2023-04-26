<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글목록</title>
</head>
<body>
	<h1>게시판 글리스트</h1>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="1000">
		<tr>
			<th>번 호</th>
			<th>제 목</th>
			<th>글쓴이</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list }" var="dto">
		<tr>
			<td>${dto.bid}</td>
			
			<td>
				<c:forEach begin="1" end="${dto.bindent }">&nbsp;&nbsp;&nbsp;</c:forEach>
				<a href="content_view?bid=${dto.bid}">${dto.btitle}</a>				
			</td>
			
			<td>${dto.bname}</td>
			<td>${dto.bdate}</td>
			<td>${dto.bhit}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<input type="button" value="글쓰기" onclick="script:window.location.href='write_form'">
			</td>
		</tr>
	</table>
</body>
</html>