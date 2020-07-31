package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化过滤器
        System.out.println("过滤器初始化。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        if(req.getRequestURI().contains("/login")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            HttpSession session = req.getSession();
            Object user = session.getAttribute("user");
            if (user == null){
                resp.sendRedirect(req.getContextPath() + "/jsp/login.jsp");
                filterChain.doFilter(req,resp);
            }
            filterChain.doFilter(req,resp);
        }
    }

    @Override
    public void destroy() {
        //容器正常关闭时触发
        System.out.println("销毁过滤器。。。。");
    }
}
