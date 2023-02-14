<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
     String path = request.getContextPath();
     String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>


<head>
     <meta charset="UTF-8">
     <title>资产托管平台</title>
</head>
<body>
<h2>Hello World!</h2>
<p>中文测试</p>
<p><a href="/Financial/login.html">LOGIN PAGE</a></p>
<p><a href="/Financial/register.html">REGISTER</a></p>
<p><a href="/Financial/picture">字节流图片</a></p>


</body>
</html>
