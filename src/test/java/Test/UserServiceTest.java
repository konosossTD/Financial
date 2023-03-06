package Test;
import com.may.mapper.StockMapper;
import com.may.mapper.UserMapper;
import com.may.pojo.Stock;
import com.may.pojo.User;
import com.may.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class UserServiceTest {
    SqlSessionFactory factory=SqlSessionFactoryUtils.getSqlsessionFactory();
    @Test
    public void SelectAll(){
        SqlSession sqlSession=factory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> user;
        user = mapper.selectAll();
        sqlSession.close();
        System.out.println(user);
    }
}
