package io.notnames.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        int a = 100;
        byte b = (byte) a;  //强制类型转换
        System.out.println(b);


        int i = 130;
        byte j = (byte) i;  //强制类型转换
        System.out.println(j);

        double dou = 99.5;
        int num = (int) dou;   //小数强转整数，会直接去掉小数点后的数
        System.out.println(num);

        double dou1 = 13034253224.5;
        int num1 = (int) dou1;   //转化后的整数依然超过了范围，数据还是会出错
        System.out.println(num1);

        System.out.println("--------------");

//        字节编码转char

        int data = 97;
        char data1 = (char) data;
        System.out.println(data1);

        System.out.println("-----------");

        byte i1 = 53;
        System.out.println(getType(i));
        System.out.println(getType(i1));




    }
    public static String getType(Object o) {
        return o.getClass().toString();
    }
}
