package io.notnames.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //键盘录入技术
        //得到一个sc对象
        Scanner sc = new Scanner(System.in);

//        调用sc对象,输入数字类型
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("年龄age是：" + age);

        System.out.println("请输入名字：");
        String name = sc.next();
        System.out.println("欢迎：" + name);

    }
}
