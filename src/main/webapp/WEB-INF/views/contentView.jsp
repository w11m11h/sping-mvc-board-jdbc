<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2>글 내용 보기</h2>
	<hr>	
	<table border="1" cellspacing="0" cellpadding="0" width="500">
		<tr>
			<td>번 호</td>
			<td>${content.bid }</td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>${content.bname }</td>
		</tr>
		<tr>
			<td>제 목</td>
			<td>${content.btitle }</td>
		</tr>
		<tr>
			<td>내 용</td>
			<td>${content.bcontent }</td>
		</tr>
		<tr>
			<td>등록일</td>
			<td>${content.bdate }</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${content.bhit }</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="수정" onclick="script:window.location.href='modify_form?bid=${content.bid }'">
				<input type="button" value="삭제" onclick="script:window.location.href='delete?bid=${content.bid }'">
				<input type="button" value="글목록" onclick="script:window.location.href='list'">
				<input type="button" value="글쓰기" onclick="script:window.location.href='write_form'">
				<input type="button" value="답변" onclick="script:window.location.href='reply_form?bid=${content.bid }'">
			</td>
		</tr>
	</table>
</body>
</html>