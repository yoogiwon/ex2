<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice View</h1>
	<table>
		<tr>
			<td>num</td>
			<td>title</td>
			<td>writer</td>
			<td>date</td>
			<td>hit</td>
		</tr>
		<tr>
			<td>${view.num}</td>
			<td>${view.title}</td>
			<td>${view.writer}</td>
			<td>${view.reg_date}</td>
			<td>${view.hit}</td>
		</tr>
		<tr>
			<td colspan="5">${view.contents}</td>
		</tr>
	</table>
	<a href="noticeUpdate?num=${view.num}">noticeUpdate</a>
	<a href="noticeDelete?num=${view.num}">noticeDelete</a>
</body>
</html>