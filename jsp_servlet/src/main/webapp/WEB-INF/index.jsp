<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello I'm the first Jsp from this project </h1>
<%
    String variable = (String) req.getAttribute("variable");
    out.println(variable);
%>
<p>
    0 To 10    
</p>
<%
    for(int i=0;i<=10;i++)
    {
        out.println(i);
    }
%>   
</body>
</html>
