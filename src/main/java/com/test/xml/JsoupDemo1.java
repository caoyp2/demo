package com.test.xml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {

    public static void main(String[] args) throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //通过id获取元素
        Element s1 = document.getElementById("s1");
        System.out.println(s1);
        System.out.println("-------------------------");

        //通过tag获取元素
        Elements students = document.getElementsByTag("student");
        for(Element element : students){
            System.out.println(element);
        }
        System.out.println("-------------------------");


    }
}
