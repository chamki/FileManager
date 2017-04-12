<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.regex.Pattern" %>
<%@ page import="java.util.regex.Matcher" %>
    
<%
request.setCharacterEncoding("UTF-8");
String phone = request.getParameter("phone");
String userName = request.getParameter("userName");
String password1 = request.getParameter("password1");
String password2 = request.getParameter("password2");
String address = request.getParameter("address");

System.out.println("phone= "+ phone);
System.out.println("userName= "+ userName);
System.out.println("password= "+ password1);
System.out.println("password2= "+ password2);
System.out.println("address= "+ address);

PrintWriter pw = response.getWriter();

if(userName.equals("admin")){
	pw.write("用户名已存在，请输入其他用户名！");
}
 

 
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>