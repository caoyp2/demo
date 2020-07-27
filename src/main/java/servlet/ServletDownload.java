package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class ServletDownload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getParameter("filename");
        ServletContext servletContext = req.getServletContext();
        String filepath = servletContext.getRealPath("/img/" + filename);

        FileInputStream fis = new FileInputStream(new File(filepath));
        int len = 0;
        byte[] buff = new byte[1024 * 8];
        ServletOutputStream sos = resp.getOutputStream();

        //设置响应头信息
        String mimeType = servletContext.getMimeType(filename);
        resp.setContentType(mimeType);

        //设置浏览器以附件解析文件，不直接打开文件
        resp.setHeader("content-disposition","attachment;filename=" + filename);
        //将流输出到浏览器
        while((len = fis.read(buff)) != -1){
            sos.write(buff,0,len);
        }
        fis.close();
    }
}
