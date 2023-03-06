package com.may.web;

import com.may.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.may.pojo.User;
import com.may.util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
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
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlsessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper usermapper=sqlSession.getMapper(UserMapper.class);;
        System.out.println("查询用户名...");
        User existUserFlag=  usermapper.selectByUsername(map.get("username")[0]);

        if (existUserFlag!=null){
            System.out.println();
            writer.write("用户已存在");
        }else {//如果查询为空
            User newuser=new User();
            newuser.MapCastToUser(map);
            usermapper.insertUser(newuser);
            sqlSession.commit();
            writer.write("<script language='javascript'>alert('注册成功')</script>");
        }
        sqlSession.close();

//        request.getRequestDispatcher("/ForwardDemo1").forward(request,response);

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);

    }


}
