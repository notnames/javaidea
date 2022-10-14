package io.notnames.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        double a = 9.3;
        double b = 16;
        System.out.println(a <= b & b != 10);

        boolean c = a >= 3 & b == 10;
        System.out.println(c);
        System.out.println(!c);

//        短路与，短路或

        System.out.println("----&& & || |-----");
        System.out.println(a >= 10 && b++ <= 10);
        System.out.println(b);
        System.out.println(a >= 10 & b++ <= 10);
        System.out.println(b);

        System.out.println(a <= 10 || b++ <= 10);
        System.out.println(b);
        System.out.println(a <= 10 | b++ <= 10);
        System.out.println(b);

    }
}
