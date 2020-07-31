package filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logindo")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("admin".equals(username) && "admin".equals(password)){
            //登录成功
            HttpSession session = req.getSession();
            session.setAttribute("user",username);
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }else {
            req.setAttribute("msg","login fail !!!!");
            req.getRequestDispatcher("/jsp/login.jsp").forward(req,resp);
        }
    }
}
