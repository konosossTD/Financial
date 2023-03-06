package com.may.service;
 import com.may.mapper.StockMapper;
 import com.may.pojo.Stock;
 import com.may.util.SqlSessionFactoryUtils;
 import org.apache.ibatis.session.SqlSessionFactory;
 import org.apache.ibatis.session.SqlSession;
 import java.util.List;

public class StockService {

 SqlSessionFactory factory=SqlSessionFactoryUtils.getSqlsessionFactory();
 public List<Stock> selectAllStocks(){

     SqlSession sqlSession=factory.openSession();
     StockMapper mapper=sqlSession.getMapper(StockMapper.class);
     List<Stock> Stocks;
     Stocks = mapper.selectAllStocks();
     sqlSession.close();
     return  Stocks;

    }
    public void insertStock(Stock stock){
        SqlSession sqlSession=factory.openSession();
        StockMapper mapper=sqlSession.getMapper(StockMapper.class);
        //检验唯一性
        //获取数据

        //插入
        mapper.insertStock(stock);
        sqlSession.commit();
        sqlSession.close();


    }

    public void deleteStock(String stockCode){
        SqlSession sqlSession=factory.openSession();
        StockMapper mapper=sqlSession.getMapper(StockMapper.class);
        mapper.deleteStock(stockCode);
        sqlSession.commit();
        sqlSession.close();
    }

}
