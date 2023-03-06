package com.may.web;

import com.may.pojo.Stock;
import com.may.service.StockService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "insertStockServlet", value = "/insertStockServlet")
public class insertStockServlet extends HttpServlet {
    private StockService service=new StockService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Stock stock=new Stock();
        stock.setStockCode(request.getParameter("stockCode"));
        stock.setStockName(request.getParameter("stockName"));
        stock.setStockCompany(request.getParameter("stockCompany"));
        stock.setCurrentStockPrice(request.getParameter("currentStockPrice"));
        stock.setChangePrice(request.getParameter("changePrice"));
        stock.setHighPrice(request.getParameter("highPrice"));
        stock.setVolume(request.getParameter("volume"));
        stock.setLowPrice(request.getParameter("lowPrice"));
        stock.setLastClosingPrice(request.getParameter("lastClosingPrice"));
        stock.setOpeningPrice(request.getParameter("openingPrice"));
        stock.setAmplitudePercent(request.getParameter("amplitudePercent"));
        stock.setChangePercent(request.getParameter("changePercent"));
        stock.setVolumePrice(request.getParameter("volumePrice"));
        service.insertStock(stock);
        request.getRequestDispatcher("/selectAllStockServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
