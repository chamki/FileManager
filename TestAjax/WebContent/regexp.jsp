<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
 //alert("abchello".search(/hello/));
 //alert("abchello".replace(/hello/,"hi"));
 //alert("abchelloasdasdhelloasd".split(/hello/));
 //alert("abchelloasdasdhelloasd".match(/hello/));
 //alert("abchelloasdasdhelloasd".match(/hello/g));
 //alert(/hello/.test("abchelle"));
 
 //var reg=/hello/g;
 //alert(reg.exec("abchelloasdasdhelloasd"));
//var reg=/hello/g;
//reg.lastIndex; //0
//alert(reg.exec("abchelloasdasdhelloasd")); // ["hello"]
//reg.lastIndex; //8
//alert(reg.exec("abchelloasdasdhelloasd")); // ["hello"]
//reg.lastIndex; //19
//alert(reg.exec("abchelloasdasdhelloasd")); // null
//reg.lastIndex;
//alert(reg.exec("abchelloasdasdhelloasdhello")); //0

//匹配数字:  \d
//alert("ad3ad2ad".match(/\d/g));  // ["3", "2"]
//匹配除换行符以外的任意字符:  .
//alert("a\nb\rcde".match(/./g));  // ["a", "b", "c"]
//匹配字母或数字或下划线 ： \w
//alert("a5_  汉字@!-=".match(/\w/g));  // ["a", "5", "_"]
//匹配空白符:\s
//alert("\n \r".match(/\s/g));  //[" ", " ", ""] 第一个结果是\n，最后一个结果是\r
//匹配【单词开始或结束】的位置 ： \b
alert("how are you".match(/\b\w/g));  //["h", "a", "y"] 
// 匹配【字符串开始和结束】的位置:  开始 ^ 结束 $
//alert("how are you".match(/^\w/g)); // ["h"]

</script>




<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>