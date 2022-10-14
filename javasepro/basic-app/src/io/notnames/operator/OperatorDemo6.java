package io.notnames.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 20;

        boolean rs = a == b;
        System.out.println(rs);
        boolean rs1 = a != b;
        System.out.println(rs1);

        System.out.println("---");

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);

        System.out.println("--------");

        System.out.println(a <= c);
        System.out.println(a == c);


    }
}
