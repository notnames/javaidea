package io.notnames.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {

//        自增自减

        int a = 10;
        a++;

        System.out.println("----------");

        System.out.println(a);
        int b = ++a;
        System.out.println("int b = ++a;a=" + a);
        System.out.println("int b = ++a;b=" + b);

        System.out.println("----------");

        System.out.println(a);
        int c = a++;
        System.out.println("int c = a++;a=" + a);
        System.out.println("int c = a++;c=" + c);

        System.out.println("---------------");

//        面试
        int k = 3;
        int p = 5;
        int kp = k++ + ++k - --p + p-- - k-- + ++p + 2;

//        k     3   4   5   4
//        p     5   4   3   4
//        kp    3   +5  -4  +4  -5  +4  +2

        int kp1 = 3   +5  -4  +4  -5  +4  +2;
        System.out.println(kp1);

        System.out.println(k);
        System.out.println(p);
        System.out.println(kp);



    }
}
