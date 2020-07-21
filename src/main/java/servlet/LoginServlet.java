package servlet;


import org.apache.commons.beanutils.BeanUtils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/logindemo")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap = req.getParameterMap();
        User loginUser = new User();
        try {
            //工具类转换对象
            BeanUtils.populate(loginUser,parameterMap);
            if("admin".equals(loginUser.getUsername())){
                req.setAttribute("user",loginUser);
                req.getRequestDispatcher("/index").forward(req,resp);
            }else {
                //动态获取虚拟目录
                String contextPath = req.getContextPath();
                resp.sendRedirect(contextPath + "/login.html");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
