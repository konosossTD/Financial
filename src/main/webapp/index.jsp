<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
  SimpleDateFormat formatter= new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
  Date date = new Date(System.currentTimeMillis());
%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Financial Products</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      margin: 0;
      font-family: Arial, sans-serif;
    }

    /* Header */
    header {
      background-color: #333;
      color: #fff;
      padding:0px;
      display: flex;
      justify-content: space-between;
      /*position: fixed;*/
      top: 0;
      left: 0;
      right: 0;
      z-index: 999;
      align-items: center;
    }

    header b{
      font-size: 2em;
      padding: 15px;
    }

    header a {
      color: #fff;
      text-decoration: none;
      padding: 10px;

    }

    /* Main Content */
    main {
      padding: 20px;
    }

    /* Product Cards */
    .product-card {
      background-color: #f2f2f2;
      padding: 20px;
      margin-bottom: 20px;
      text-align: center;
    }

    /* Unknown Content */
    .unknown-content {
      background-color: #ccc;
      height: 300px;
      margin-bottom: 20px;
    }
  </style>
</head>
<body>
<!-- Header -->
<header>
  <b>Financial Products</b>
  <p><%=formatter.format(date)%></p>
  <nav>
    <a href="${pageContext.request.contextPath}/login.jsp">Login</a>
    <a href="/Financial/register.jsp">Register</a>
    <a href="/Financial/picture">Picture</a>
    <a href="/Financial">Customer Service</a>
  </nav>
</header>

<!-- Main Content -->
<main>
  <!-- Product Card - Stock -->
  <div class="product-card">
    <h2><a style="text-decoration: none" href="/Financial/selectAllStockServlet" >Stock </a></h2>
    <p>Invest in the stock market and own a piece of the company.</p>
  </div>

  <!-- Product Card - Fund -->
  <div class="product-card">
    <h2>Fund</h2>
    <p>Diversify your investment portfolio with a fund that invests in multiple assets.</p>
  </div>

  <!-- Product Card - Bond -->
  <div class="product-card">
    <h2>Bond</h2>
    <p>Lend money to a company or government and earn fixed interest payments.</p>
  </div>

  <!-- Product Card - Option -->
  <div class="product-card">
    <h2>Option</h2>
    <p>Buy the right, but not the obligation, to buy or sell an underlying asset at a set price.</p>
  </div>

  <!-- Unknown Content -->
  <div class="unknown-content"></div>
</main>
</body>
</html>
