package servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo implements Servlet {
    /**
     * 创建servlet，初始化信息
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    /**
     * servlet得配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 声明服务代码
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     *
     * servlet被创建一次，service被多次调用
     * 多线程访问时，会带来安全问题，因此要避免
     * 在servlet中定义成员变量，也不要对成员变量赋值
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("request success .......");
    }

    /**
     * 获取servlet信息
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 服务被正常关闭时调用
     */
    @Override
    public void destroy() {

    }
}
