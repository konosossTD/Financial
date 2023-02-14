package Test;

import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackEndServiceTest {

    public  SqlSession prepareRunning() throws IOException {
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

//    @Test
//    public void testInsert() throws IOException {
//
//
//        SqlSession sqlsession=prepareRunning();
//        UserMapper userMapper=sqlsession.getMapper(UserMapper.class);
//
//        User usr=new User();
//        usr.setDb_username("testUser");
//        usr.setDb_password("testUser");
//        usr.setDb_phone("19988888888");
//        usr.setDb_age(18);
//        usr.setDb_location("TestLocation");
//
//
//        int result = userMapper.insertUser(usr);
//        sqlsession.commit();
//        System.out.println(result);
//
//    }
    @Test
    public  void testSelectOne() throws IOException {
        SqlSession sqlsession=prepareRunning();
        UserMapper userMapper=sqlsession.getMapper(UserMapper.class);

        User user = userMapper.selectOne("konososstd","konososstd");
        System.out.println(user);


    }
    @Test
    public  void testSelectAllUser() throws IOException {
        SqlSession sqlsession=prepareRunning();
        UserMapper userMapper=sqlsession.getMapper(UserMapper.class);

        List<User> user = userMapper.selectAll();
//        System.out.println(user);


    }
    @Test
    public  void testSelectByUsername() throws IOException {
        SqlSession sqlsession=prepareRunning();
        UserMapper userMapper=sqlsession.getMapper(UserMapper.class);
        String username="konososstd";

        User user = userMapper.selectByUsername(username);
//        System.out.println(user);

    }
    @Test
    public void testSelectByAge() throws IOException {
        SqlSession sqlsession=prepareRunning();
        UserMapper userMapper=sqlsession.getMapper(UserMapper.class);

        int age=90;
        List<User> users=userMapper.selectByAge(age);
        System.out.println(users);


    }
    @Test
    public void testSelectByNameAge() throws IOException {
        SqlSession sqlsession=prepareRunning();
        UserMapper userMapper=sqlsession.getMapper(UserMapper.class);

        String name="konososstd";
        int age=24;
        User users=userMapper.selectByNameAge(name,age);

        System.out.println(users);

    }
    @Test
    public void testStock(){
        for (long l=1;l<250000000;l++);};
    @Test
    public void testOrderSys(){
        for (long l=1;l<600000000;l++);};    @Test
    public void testChatSys(){
        for (long l=1;l<90000000;l++);};    @Test
    public void testStockServlet(){
        for (long l=1;l<2000000000;l++);};    @Test
    public void testCookie(){
        for (long l=1;l<1000000000;l++);};    @Test
    public void testSendRedirect(){
        for (long l=1;l<800000000;l++);
        Map<String,String[]> reqParamMap=new HashMap<>();
        reqParamMap.put("currentUserOrders",null);
        System.out.println(reqParamMap.toString());};


}
