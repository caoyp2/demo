package servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/*
    生成验证码
 */
@WebServlet("/servletcode")
public class ServletCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //生成图片
        int width = 100;
        int height = 50;
        //创建一对象，在内存中图片（验证码图片对象）
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //美化图片
        Graphics g = image.getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0,0,width,height);

        //画边框
        g.setColor(Color.BLACK);
        g.drawRect(0,0,width -1, height -1);

        //写验证码
        g.drawString("2",20,25);
        g.drawString("3",40,25);
        g.drawString("4",60,25);

        ImageIO.write(image,"jpg",resp.getOutputStream());
    }
}
