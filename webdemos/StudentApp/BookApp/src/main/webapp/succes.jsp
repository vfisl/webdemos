<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String title=(String)request.getAttribute("mytitle");
out.print("Title is: "+title+"<br>");
Integer bookId=(Integer)request.getAttribute("bookId");
out.print("BookId is : "+bookId+"<br>");
out.print("Category is: "+request.getAttribute("category"));
out.print("Author is: "+request.getAttribute("author")+"<br>");
Double price=(Double)request.getAttribute("price");
out.print("Price is : "+price+"<br>");
%>
</body>
</html>