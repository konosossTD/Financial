package Servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "picture", value = "/picture")
public class picture extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        FileInputStream imgStream=new FileInputStream("C:\\Users/konos/Desktop/JAVA_PROJ/Financial/src/main/resources/logo.jpg");
        ServletOutputStream outputStream= response.getOutputStream();

        IOUtils.copy(imgStream,outputStream);
        System.out.println("使用了common-io工具类");
        imgStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
