package com.may.mapper;

import com.may.pojo.Stock;
import com.may.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StockMapper {

    List<Stock> selectAllStocks();

    void insertStock(Stock stock);
    @Delete("delete from dbstock where stockCode = #{stockCode} ")
    void deleteStock(String stockCode);
}
