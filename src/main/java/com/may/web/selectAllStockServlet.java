package com.may.web;

import com.may.pojo.Stock;
import com.may.service.StockService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "selectAllStockServlet", value = "/selectAllStockServlet")
public class selectAllStockServlet extends HttpServlet {

    private StockService service=new StockService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//1.调用StockService
        List<Stock> stocks=service.selectAllStocks();
//        System.out.println(stocks);
//2.存入Request域中
        request.setAttribute("stocks",stocks);
//      3.转发到stock.jsp
        request.getRequestDispatcher("/stocks.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
