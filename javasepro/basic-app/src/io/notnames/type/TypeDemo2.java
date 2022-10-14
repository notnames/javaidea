package io.notnames.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);

//        面试题
        byte i = 100;
        byte j = 120;
//        问：k用什么类型，     ？ k = i + j
//        答：
//        short k1 = i + j;   //默认i和j是int类型，不能用short类型
        int k2 = i + j;
    }

}
