package io.github.variableDemo1;

public class Variable {
    public static void main(String[] args) {
//        变量

        double money = 6.0;
        System.out.println(money);

        money = money +4.0;
        System.out.println(money);


        System.out.println("----------------");

        int age = 21;
        System.out.println(age);
        age = 35;
        System.out.println(age);

        System.out.println("------------");

        char ch = 'a';
        System.out.println(ch);
        System.out.println(ch +1);

        System.out.println("--------");

//        二进制
        int i1 = 0b0101010010;
        System.out.println(i1);

//        八进制
        int i2 = 0234574;
        System.out.println(i2);

        int i21 = 234574;
        System.out.println(i21);

//        十六进制
        int i3 = 0x213acf;
        System.out.println(i3);


        System.out.println("-----------");
//        基本数据类型
        byte num1 = 98;
//        num1 = 128;   //报错，超出范围
        System.out.println(num1);




    }

}
