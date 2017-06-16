<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice Write</h1>
	<form action="notice${path}" method="post">
		<input type="hidden" name="num" value="${update.num}">
		<p>
			WRITER : <input type="text" name="writer" value="${update.writer}" readonly="readonly">
		</p>
		<p>
			TITLE : <input type="text" name="title" value="${update.title}">
		</p>
		<p>
			CONTENTS : <textarea rows="3" cols="20" name="contents">${update.contents}</textarea>
		</p>
		<button>submit</button>
	</form>
</body>
</html>