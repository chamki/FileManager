<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script language="javascript" type="text/javascript" src="sources/js/register.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userServlet" method="post" onsubmit="return checkInfo()">
	  <table align="center" >
	  		<tr>
	  			<td>用户名：</td>
	  			<td><input type="text" name="userName" id="userName" onchange="checkName()"/>
	  				<span id="username"></span>
	  			</td>
	  		</tr>
	  		
	  		<tr>
	  			<td>密码：</td>
	  			<td><input type="password" name="password1" id="password1" onchange="checkPassword1()"/>
	  				<span id="pw1"></span>
	  			</td>
	  		</tr>
	  		
	  		<tr>
	  			<td>密码确认：</td>
	  			<td><input type="password" name="password2" id="password2" onchange="checkPassword2()"/>
	  				<span id="pw2"></span>
	  			</td>
	  		</tr>
	  		
	  		<tr>
	  			<td>联系电话：</td>
	  			<td><input type="text" name="phone" id="phone" width="25" onchange="checkPhone()"/>
	  			<span id="phoneInfo"></span>
	  			</td>
	  			
	  		</tr>
	  		
	  		<tr>
	  			<td>邮箱：</td>
	  			<td><input type="text" name="email" id="email" width="25" onchange="checkEmail()"/>
	  			<span id="mail"></span>
	  			</td>
	  			
	  		</tr>
	  		
	  		<tr>
	  			<td>住址：</td>
	  			<td><textarea id="address" name="address" rows="5" cols="55" onchange="checkAddress()"></textarea><br>
	  			<span id="addr"></span></td>
	  		</tr>
	  		
	  		<tr>
	  			<td><input type="submit" value="提交" id="submit"/></td>
	  			<td><input type="reset" value="重置" id="reset"/></td>
	  		</tr>
	  	
	  </table>	
  	</form>
</body>

</html>