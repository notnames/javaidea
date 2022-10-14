package io.notnames.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
//        + - * / %
        int a = 10;
        int b = 3;

        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("----------");

        System.out.println(3 / 2);          //只取整数部分
        System.out.println(3 * 1.0 / 2);    //结果是小数

        System.out.println(10 * 1.0 / 3);       //无限小数会取多少位？


    }
}
