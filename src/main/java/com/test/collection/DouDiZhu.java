package com.test.collection;

import java.util.*;

/**
 * 斗地主
 */
public class DouDiZhu {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //创建一个存储牌的map
        Map<Integer, String> pokerMap = new HashMap<>();
        int count = 1;
        //吧牌加到集合中去
        pokerMap.put(count++, "大王");
        pokerMap.put(count++, "小王");

        for (int i = 0; i < colors.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                pokerMap.put(count++, colors.get(i) + numbers.get(j));
            }
        }

        //打乱牌的顺序
        Set<Integer> keyset = pokerMap.keySet();
        List<Integer> numberList = new ArrayList<>();
        numberList.addAll(keyset);

        //打乱顺序
        Collections.shuffle(numberList);

        //然后在将牌发给三个人
        ArrayList<Integer> noP1 = new ArrayList<Integer>();
        ArrayList<Integer> noP2 = new ArrayList<Integer>();
        ArrayList<Integer> noP3 = new ArrayList<Integer>();
        ArrayList<Integer> dipaiNo = new ArrayList<Integer>();

        //发牌
        for (int i = 0; i < numberList.size(); i++) {
            Integer key = numberList.get(i);
            if (i >= 51) {
                dipaiNo.add(key);
            } else {
                if (i % 3 == 0) {
                    noP1.add(key);
                } else if (i % 3 == 1) {
                    noP2.add(key);
                } else {
                    noP3.add(key);
                }
            }
        }

        // 创建三个玩家牌面集合 以及底牌牌面集合
        List<String> person1 = new ArrayList<>();
        List<String> person2 = new ArrayList<>();
        List<String> person3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();

        for(int i = 0; i < noP1.size(); i++){

            person1.add(pokerMap.get(noP1.get(i)));
        }

        for(int i = 0; i < noP2.size(); i++){

            person2.add(pokerMap.get(noP2.get(i)));
        }

        for(int i = 0; i < noP3.size(); i++){

            person3.add(pokerMap.get(noP3.get(i)));
        }

        for(int i = 0; i < dipaiNo.size(); i++){

            dipai.add(pokerMap.get(dipaiNo.get(i)));
        }

        System.out.println("person1: " + person1.toString());
        System.out.println("person1: " + person2.toString());
        System.out.println("person1: " + person3.toString());
        System.out.println("person1: " + dipai.toString());

    }
}
