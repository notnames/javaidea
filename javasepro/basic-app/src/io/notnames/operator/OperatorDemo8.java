package io.notnames.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        三元运算符
        String rs = a <= b ?  "a" + a + "小于" + "b" + b : a + "大于" + b;
        String rs1 = a >= b ? "大于" : "小于";
        System.out.println(rs + "\n" + rs1);

        System.out.println("---取较大值-------");

        int max = a > b ? a : b;
        System.out.println(max);

        System.out.println("---取三个数中的最大值-------");

        int c = 15;
        int temp = a > b ? a : b;
        int rsMax = temp > c ? temp : c;
        System.out.println(rsMax);

        int rsMax1 = a > b ? a > c ? a : c : b > c ? b : c;
//        int rsMax2 = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(rsMax1);

    }
}
