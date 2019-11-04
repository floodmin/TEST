<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>board-List-Page</title>
</head>
<body>
<h2>board list</h2>
<button class="btn btn-primary" onclick="location.href='/insert'">글쓰기</button>
 	<table class="table table-hover">
		<thead>
			<tr>
				<th>NO</th>
				<th>Subject</th>
				<th>Writer</th>
				<th>date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="list" items="${boardList}">
				<tr onclick="location.href='/boardDetail/${list.boardNum}'">
					<td>${list.boardNum}</td>
                    <td>${list.subject}</td>
                    <td>${list.writer}</td>
                    <td>${list.regDate}</td>
                </tr>
          </c:forEach>
		</tbody>
	</table>
	
<%@ include file="bootstrap.jsp" %>
</body>
</html>