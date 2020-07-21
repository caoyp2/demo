package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo3")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置参数得编码格式，防止中文乱码
        req.setCharacterEncoding("utf-8");

        //转发
        /*
            服务起内部的转发，不能转发到外部请求
            转发后，浏览器上地址不会改变
            转发只发了一次请求，因此可以实现数据共享
         */
        //重定向
        /*
            重定向地址栏会发生变化
            重定向可以访问系统外部的资源
            重定向是发出了两次请求，不能用request来共享资源
         */
        req.getRequestDispatcher("/demo4").forward(req,resp);
    }
}
