package io.notnames.type;

public class TypeDemo1 {
    public static void main(String[] args) {

        byte a = 10;
        short b = a;  //自动类型转换
        System.out.println(a);
        System.out.println(b);

        char c = '中';
        int d = c;      //返回字节编码
        System.out.println(d);



        System.out.println("-----------------");


    }
}
