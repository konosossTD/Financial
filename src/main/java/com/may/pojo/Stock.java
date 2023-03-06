package com.may.pojo;

public class Stock {
    //代码
    private String stockCode;
    //股票名称
    private String stockName;


    //全称
    private String stockCompany;
    //最新价格
    private String currentStockPrice;
    //涨跌幅
    private String changePercent;
    //涨跌价格
    private String changePrice;
    //成交量(手)
    private String volume;
    //成交额(万元)
    private String volumePrice;
//    收盘价
    private String lastClosingPrice;
//    开盘价
    private String openingPrice;
//    最高
    private String highPrice;
//    最低
    private String lowPrice;
//    振幅
    private String amplitudePercent;

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockCode='" + stockCode + '\'' +
                ", stockCompany='" + stockCompany + '\'' +
                ", currentStockPrice='" + currentStockPrice + '\'' +
                ", changePercent='" + changePercent + '\'' +
                ", changePrice='" + changePrice + '\'' +
                ", volume='" + volume + '\'' +
                ", volumePrice='" + volumePrice + '\'' +
                ", lastClosingPrice='" + lastClosingPrice + '\'' +
                ", openingPrice='" + openingPrice + '\'' +
                ", highPrice='" + highPrice + '\'' +
                ", lowPrice='" + lowPrice + '\'' +
                ", amplitudePercent='" + amplitudePercent + '\'' +
                '}'+ '\n';
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockCompany() {
        return stockCompany;
    }

    public void setStockCompany(String stockCompany) {
        this.stockCompany = stockCompany;
    }

    public String getCurrentStockPrice() {
        return currentStockPrice;
    }

    public void setCurrentStockPrice(String currentStockPrice) {
        this.currentStockPrice = currentStockPrice;
    }

    public String getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(String changePercent) {
        this.changePercent = changePercent;
    }

    public String getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(String changePrice) {
        this.changePrice = changePrice;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolumePrice() {
        return volumePrice;
    }

    public void setVolumePrice(String volumePrice) {
        this.volumePrice = volumePrice;
    }

    public String getLastClosingPrice() {
        return lastClosingPrice;
    }

    public void setLastClosingPrice(String lastClosingPrice) {
        this.lastClosingPrice = lastClosingPrice;
    }

    public String getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(String openingPrice) {
        this.openingPrice = openingPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getAmplitudePercent() {
        return amplitudePercent;
    }

    public void setAmplitudePercent(String amplitudePercent) {
        this.amplitudePercent = amplitudePercent;
    }
}
