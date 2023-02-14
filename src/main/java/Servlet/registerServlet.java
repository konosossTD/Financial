package Servlet;

import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html; charset = utf-8");
        Map<String, String[]> map = request.getParameterMap();



        for (String key : map.keySet()) {
            key=new String(key.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
            System.out.print(key + ":");

            String[] values = map.get(key);
            for (String value:values) {
                value = new String(value.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
                System.out.print(value + " ");

                }
            }



        System.out.println();
        PrintWriter writer = response.getWriter();


        //查询用户名
        SqlSession session=prepareQuerying();
        UserMapper usermapper=session.getMapper(UserMapper.class);;
        System.out.println("查询用户名...");
        User existUserFlag=  usermapper.selectByUsername(map.get("username")[0]);

        if (existUserFlag!=null){
            System.out.println();
            writer.write("用户已存在");
        }else {//如果查询为空
            User newuser=new User();
            newuser.MapCastToUser(map);
            usermapper.insertUser(newuser);
            session.commit();
            writer.write("<script language='javascript'>alert('注册成功')</script>");
        }

//        request.getRequestDispatcher("/ForwardDemo1").forward(request,response);

    }

    private SqlSession prepareQuerying(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }


}
