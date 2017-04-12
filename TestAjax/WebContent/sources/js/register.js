/**
 * index页面相关的javascript 代码
 */
//密码
var password1 = "";

//确认密码
var password2 = "";

//用户名
var userName = "";

//电话号码
var phone = "";

//地址
var address = "";

//邮箱
var Email = "";

var request = false;
   try {
     request = new XMLHttpRequest();
   } catch (trymicrosoft) {
     try {
       request = new ActiveXObject("Msxml2.XMLHTTP");
     } catch (othermicrosoft) {
       try {
         request = new ActiveXObject("Microsoft.XMLHTTP");
       } catch (failed) {
         request = false;
       }  
     }
   }

   if (!request)
     alert("Error initializing XMLHttpRequest!");

   //检查电话号码
   function checkPhone() {
	    phone = document.getElementById("phone").value;
		if(phone.match(/\d{11}/) == null || phone.length < 11 || phone.length > 11){
			document.getElementById("phoneInfo").innerHTML = "电话号码不正确，请重新输入！";
		}else {
			document.getElementById("phoneInfo").innerHTML = "";
		}
   }

   //检查用户名
   function checkName() {
	   userName = document.getElementById("userName").value;
	   if(userName.length < 3 || userName.length > 20) {
		   document.getElementById("username").innerHTML = "用户名长度不正确，长度应为3-20位数字或字母组合！";
		   return false;
	   }else if (userName.match(/^[a-zA-Z0-9]/) == null) {
		   document.getElementById("username").innerHTML = "用户名应以字母或者数字开头！";
		   return false;
	   }else if(userName.match(/\s/) != null) {
		   document.getElementById("username").innerHTML = "用户名中不能包含空白字符！";
		   return false;
	   }
	   var url = "ajax/test.jsp?userName=" + escape(userName);
	     request.open("GET", url, true);
	     request.onreadystatechange = cueName;
	     request.send(null);
   }
   
   function cueName() {
	   if (request.readyState == 4) {
		   if (request.status == 200){
	    	   var response = request.responseText.split("|");
	    	   document.getElementById("username").innerHTML = response[0];
	       }else if (request.status == 404){
	    	   alert("Request URL does not exist");
	       }else {
	    	   alert("Error: status code is " + request.status); 
	       }  
	   }
   }
   
   //检查密码
   function checkPassword1() {
	   password1 = document.getElementById("password1").value;
	   if(password1.length < 6 || password1.length > 12) {
		   document.getElementById("pw1").innerHTML = "密码长度不正确！长度应在6-12位";
	   }else if(password1.match(/\d{6,12}/) == null) {
		   document.getElementById("pw1").innerHTML = "密码格式不正确！密码应为数字";
	   }else{
		   document.getElementById("pw1").innerHTML = "";
	   }
	   
   }
   
   //检验两次输入的密码是否相同
   function checkPassword2() {
	   password2 = document.getElementById("password2").value;
	   if(password2.length != password1.length) {
		   document.getElementById("pw2").innerHTML = "两次输入的密码不相同！";
	   }else {
		   document.getElementById("pw2").innerHTML = "";
	   }
	   
   }
   
   //检查地址栏是否为空
   function checkAddress() {
	   address = document.getElementById("address").value;
	   
	   if(address.length < 3) {
		   document.getElementById("addr").innerHTML = "地址栏应该写详细，不能为空！"; 
	   } else {
		   document.getElementById("addr").innerHTML = "";
	   }
   }
   
   function checkEmail() {
	   Email = document.getElementById("email").value;
	   if(Email.match(/^[a-zA-Z0-9_-]{2,7}@[a-z0-9]{2,5}\.[a-z]{2,3}/) == null){
		   document.getElementById("mail").innerHTML = "邮箱格式不正确！";
	   }else {
		   document.getElementById("mail").innerHTML = "";
	   }
   }
   
   //点击提交按钮后，检测输入的信息是否有遗漏
   function checkInfo() {
	   userName = document.getElementById("userName").value;
	   password1 = document.getElementById("password1").value;
	   phone = document.getElementById("phone").value;
	   address = document.getElementById("address").value;
	   if(userName.length == 0) {
		   document.getElementById("username").innerHTML = "用户名不能为空！";
		   return false;
	   }else if (password1.length == 0) {
		   document.getElementById("pw1").innerHTML = "密码不能为空！";
		   return false;
	   }else if (phone.length == 0){
			document.getElementById("phoneInfo").innerHTML = "电话号码不能为空！";
			return false;
	   }else if (address.length < 3) {
			 document.getElementById("addr").innerHTML = "地址栏应该写详细，不能为空！"; 
			 return false;
	   } else {
		   return true;
	   }
	   
   }