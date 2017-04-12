<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.match.service.UserService" %>
<%@ page import="com.match.util.DBUtil" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="com.match.model.User" %>
<%@ page import="java.util.List" %>
    
<%
UserService service = new UserService();
Connection conn = DBUtil.getConn();
service.setConn(conn);
List<User> users = service.getUsers();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="sources/css/list.css" />
<title>Insert title here</title>
</head>
<body>
<h1>用户列表</h1>

<h1 class="center">
This heading will be center-aligned
</h1>

<p class="center">
This paragraph will also be center-aligned.
</p>

<p id="red">这个段落是红色。</p>
<p id="green">这个段落是绿色。</p>

<table align="center" border="1">
	<tr>
		<td>用户编号</td>
		<td>用户名称</td>
		<td>联系电话</td>
		<td>邮箱</td>
		<td>住址</td>
	</tr>
	
	<% 
		for(int i=0; i<users.size(); i++) {
			User u = users.get(i);
	%>
		<tr>
			<td><%=u.getId() %></td>
			<td><%=u.getName() %></td>
			<td><%=u.getPhone() %></td>
			<td><%=u.getEmail() %></td>
			<td><%=u.getAddress() %></td>
		</tr>
	
	<%			
		}
	%>
</table>
</body>
</html>