<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Board Detail Page</title>
</head>
<body>

<button class="btn btn-primary" onclick="location.href='/boardUpdate/${boardDetail.boardNum}'">UPDATE</button> <!-- 추가 -->
<button class="btn btn-danger" onclick="location.href='/boardDelete/${boardDetail.boardNum}'">DELETE</button>  <!-- 추가 -->
 
 <form action="/insertProc" method="post">
      <div class="form-group">
            <label>제목</label>
            <textarea name="content" class="form-control" rows="1">${boardDetail.subject}</textarea>
          </div>
          <div class="form-group">
            <label>작성자</label>
            <textarea name="content" class="form-control" rows="1">${boardDetail.writer}</textarea>
		  </div>
          <div class="form-group">
            <label>내용</label>
            <textarea name="content" class="form-control" rows="3">${boardDetail.content}</textarea>
          </div>
      <button type="submit" class="btn btn-success">WRITE</button>
    </form>
<%@ include file="bootstrap.jsp" %>
</body>
</html>