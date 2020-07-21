package servlet;

import org.openqa.selenium.json.JsonOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

//使用注解注册访问得url
@WebServlet("/demo2")
public class ServletDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget..............");
        //获取请求方式
        req.getMethod();

        //获取Servlet路径
        req.getServletPath();

        //获取虚拟目录
        req.getContextPath();

        //获取请求得URL
        req.getRequestURI(); //  /hello/hello.do
        req.getRequestURL(); //http://localhost:8080/hello/hello.do

        //获取远程地址
        req.getRemoteAddr();


        /*
        获取请求头里面得信息
         */
        //获取指定名称得请求头信息
        req.getHeader("User-Agent");
        
        //获取所有的请求头名称
        Enumeration<String> headerNames = req.getHeaderNames();

        /*
        获取请求体数据-Post才有请求体
         */
        BufferedReader br = req.getReader();
        while(br.readLine() != null){
            System.out.println(br.readLine());
        }
    }
}
