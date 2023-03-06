<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Financial Login</title>
  <style>
    body {
      background-color: #F5F5F5;
      font-family: Arial, sans-serif;
      text-align: center;
    }

    .logo {
      margin-top: 50px;
    }

    .container {
      background-color: white;
      border: 1px solid #CCCCCC;
      border-radius: 10px;
      box-shadow: 0px 0px 10px #CCCCCC;
      margin: 0 auto;
      padding: 30px;
      width: 80%;
    }

    h1 {
      font-size: 36px;
      color: #444444;
      margin-bottom: 40px;
    }

    input[type="text"],
    input[type="password"] {
      background-color: #F5F5F5;
      border: 1px solid #CCCCCC;
      border-radius: 5px;
      box-shadow: inset 0px 0px 10px #CCCCCC;
      padding: 10px;
      font-size: 18px;
      width: 100%;
      margin-bottom: 20px;
    }

    input[type="submit"] {
      background-color: #444444;
      color: white;
      border: none;
      border-radius: 5px;
      padding: 10px 20px;
      font-size: 18px;
      cursor: pointer;
      width: 30%;
    }

    input[type="submit"]:hover {
      background-color: #555555;
    }
  </style>
</head>
<body>
<div class="logo">
  <img width="100px" height="100px" src="https://img1.baidu.com/it/u=3374441274,4091903865&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500" alt="Financial Logo">

</div>

<div class="container">
  <h1>Login to Financial Portal</h1>
  <form action="/Financial/loginServlet" id ="loginForm" method="post">
    <input type="text" placeholder="用户名" name="username">
    <input type="password" placeholder="密码" name="password">
    <input type="submit" value="Login" >
  </form>
</div>
</body>
</html>
