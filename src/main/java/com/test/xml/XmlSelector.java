package com.test.xml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class XmlSelector {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        //通过id去获取元素
        Elements select = document.select("#s1");
        for (Element element : select){
            System.out.println(element);
        }

        System.out.println("-----------------------");

        Elements name = document.select("name");
        for (Element element : name){
            System.out.println(element);
        }
    }
}
