<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%-- <%! String name="ram";%>
<%=("welcome"+name)%>


<%int x=10,y=20; %>
<%= "Sum" +(x+y) %>
<%! int  count=0 %>
you  are visitor number<%=count++ %>
 --%>
 <%!int counter=0;  %>
 you are visitor no:<%=++ counter %>
 <br><%! String greet(){
	 return "welcome back";
 }
	 %>
	 <%=greet() %>
 }
</body>
</html>