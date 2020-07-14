package com.test.homework;

import java.util.Scanner;

public class ScannerWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int count = 1;
        while(count <= 3){
            count ++;
            System.out.println("请输入周对应得数字");
            int num = scanner.nextInt();

            System.out.println(week[num-1]);
        }
        System.out.println("输入次数超出限制！程序退出");
    }
}
