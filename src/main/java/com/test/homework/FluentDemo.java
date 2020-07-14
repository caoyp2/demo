package com.test.homework;

import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FluentDemo {


    public static void main(String[] args) {
        String ak = "xmNkAwOlcVsb7lwcxMbedFM7qMAYktbj";
        String url = "http://api.map.baidu.com/place/v2/search?query=银行&bounds=39.915,116.404,39.975,116.414&output=json&ak=" + ak;
        String response = null;
        try {
            response = Request.Get(url).execute().returnContent().toString();
            System.out.println(response);
//            String lat = "(\"lat\":[0-9.]*)+?";
//            Pattern pattern = Pattern.compile(lat);
//            Matcher matcher = pattern.matcher(response);
//           if(matcher.find()){
//               System.out.println(matcher.group());
//           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
