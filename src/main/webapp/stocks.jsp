
<%--
  Created by IntelliJ IDEA.
  User: konos
  Date: 2023/3/6
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>股票信息</title>
  <meta charset="utf-8">
  <style>
    a{
      text-decoration: none;
    }
    table {
      border-collapse: collapse;
    }

    th, td {
      padding: 8px;
      border: 1px solid black;
    }
  </style>
</head>
<body>
<h1>股票信息</h1>
<button><a href="${pageContext.request.contextPath}/insertStock.html">add</a></button>
<table>
  <tr>
    <th>序号</th>
    <th>股票代码</th>
    <th>股票名称</th>
    <th>股票公司</th>
    <th>当前股价</th>
    <th>涨跌幅</th>
    <th>涨跌价</th>
    <th>交易量(手)</th>
    <th>交易额(万元)</th>
    <th>昨收价</th>
    <th>开盘价</th>
    <th>最高价</th>
    <th>最低价</th>
    <th>振幅</th>
    <th>操作</th>
  </tr>

  <jsp:useBean id="stocks" scope="request" type="java.util.List"/>
  <c:forEach var="stock" items="${stocks}" varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td>${stock.stockCode}</td>
      <td>${stock.stockName}</td>
      <td>${stock.stockCompany}</td>
      <td>${stock.currentStockPrice}</td>
      <td>${stock.changePercent}</td>
      <td>${stock.changePrice}</td>
      <td>${stock.volume}</td>
      <td>${stock.volumePrice}</td>
      <td>${stock.lastClosingPrice}</td>
      <td>${stock.openingPrice}</td>
      <td>${stock.highPrice}</td>
      <td>${stock.lowPrice}</td>
      <td>${stock.amplitudePercent}</td>
      <td> <a href="updateStockServlet">修改</a>  <a href="deleteStockServlet">删除</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
