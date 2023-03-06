<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .logo{
            text-align: center;
        }
        .form-container {
            width: 500px;
            margin: 100px auto;
            background-color: white;
            padding: 50px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 40px;
        }

        label {
            font-weight: bold;
            margin-top: 20px;
            display: block;
        }

        input[type="text"], input[type="password"], input[type="email"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            border: 1px solid #ccc;
            box-sizing: border-box;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #333;
            color: white;
            border: none;
            font-size: 14px;
            cursor: pointer;

        }

        input[type="submit"]:hover {
            background-color: #444;
        }
    </style>
</head>
<body>
<div class="logo">
    <img width="100px" height="100px" src="https://img1.baidu.com/it/u=3374441274,4091903865&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500" alt="Financial Logo">

</div>
<div class="form-container">
    <h1>注册</h1>
    <form action="/Financial/registerServlet" method="post">
        <label for="username">用户名：</label>
        <input type="text" id="username" name="username" required>

        <label for="password">密码：</label>
        <input type="password" id="password" name="password" required>

        <label for="number">联系方式：</label>
        <input type="number" id="number" name="number" required>

        <label for="age">年龄：</label>
        <input type="number" id="age" name="age" >

        <label for="location">地址：</label>
        <input type="text" id="location" name="location" >

        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
