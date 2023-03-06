package Test;
import com.may.mapper.StockMapper;
import com.may.pojo.Stock;
import com.may.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class StockServiceTest {
    SqlSessionFactory factory=SqlSessionFactoryUtils.getSqlsessionFactory();
    @Test
    public void SelectAll(){
        SqlSession sqlSession=factory.openSession();
        StockMapper mapper=sqlSession.getMapper(StockMapper.class);
        List<Stock> Stock;
        Stock = mapper.selectAllStocks();
        sqlSession.close();
        System.out.println(Stock);
    }
}
