package io.notnames.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        System.out.println("---”+=用法“---");
        int a = 10;
        int b = 200;

//  a = a + b   并且强制转换为前面的a的数据类型，
//  若超出a的约束，可能会导致数据丢失。
//  详情看：-----实例OperatorDemo51
        a += b;
        System.out.println(a);

        byte i = 10;
        byte j = 20;
        i = (byte) (i + j);
        i += j;
        System.out.println(i);

        System.out.println("------");

        byte a1 = 10;
        int a2 = 100;

        a1 += a2;

        System.out.println(a1);



        System.out.println("---”=+是否有用“---");
        System.out.println(a);
        System.out.println(b);
        a =+ b;         //  "=+"中的‘+’不会被识别，所以变成了”a = b“赋值了
        System.out.println(a);
        System.out.println(b);



    }
}
