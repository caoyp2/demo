package com.test.xml;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlXpath {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        JXDocument jxDocument = new JXDocument(document);
        //获取student元素
        JXNode jxNode = jxDocument.selNOne("//student");
        System.out.println(jxNode.getElement());

        System.out.println("------------------------");

        //获取student元素
        JXNode jxNode1 = jxDocument.selNOne("//student[@name='s001']");
        System.out.println(jxNode1.getElement());
    }
}
