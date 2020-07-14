package com.test.homework;

import java.util.ArrayList;
import java.util.List;

public class StringWork1 {
    public static void main(String[] args) {
        String str = "jdfPASSdjPASSfadpass,,,Fail，fail，jljlkj.fail";
        List<String> list = new ArrayList();

        list.addAll(addStr(str,"PASS"));
        list.addAll(addStr(str,"pass"));
        list.addAll(addStr(str,"Fail"));
        list.addAll(addStr(str,"fail"));

        Object[] result = list.toArray();
        for(int i = 0; i < result.length; i++ ){
            System.out.println(result[i]);
        }
    }

    public static List addStr(String str, String splitstr){
        int count = 0;
        int index = 0;
        List<String> resultList = new ArrayList();
        while((index = str.indexOf(splitstr,index)) != -1){
            index = index + splitstr.length();
            count ++;
        }

        for(int i = 0; i < count; i ++){
            resultList.add(splitstr);
        }
        return resultList;
    }
}
