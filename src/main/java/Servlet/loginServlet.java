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


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //response编码
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);
        //调用mybatis完成查询
        //获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用对应的mapper方法
        User user=userMapper.selectOne(username,password);
        // 释放资源
        sqlSession.close();
        //配置printWriter字符输出流 设置对应的ContentType
        PrintWriter writer=response.getWriter();
        System.out.println(user);
        if (user != null) {
            writer.write("<script language='javascript'>alert('登录成功')</script>");
        }else {

            writer.write("用户名或密码错误");
            writer.write("<p><a href=\"/Financial/login_0.1.html\">LOGIN PAGE</a></p>");

//            request.getRequestDispatcher("/login_0.1.html").forward(request,response);
        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        this.doGet(request,response);

    }


}
