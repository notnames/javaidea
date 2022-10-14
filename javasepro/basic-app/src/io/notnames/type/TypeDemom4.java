package io.notnames.type;

public class TypeDemom4 {
    public static void main(String[] args) {

        //  定义类型变量
        int i1 = 200;
        byte i2 = 100;
        char i3 = 'a';
        double i4 = 9.3;

        //  调用方法打印变量类型
        System.out.println(getType(i1));
        System.out.println(getType(i2));
        System.out.println(getType(i3));
        System.out.println(getType(i4));
    }

    //  自定义查看变量类型的方法
    public static String getType(Object o) {        //获取变量类型的方法
        return o.getClass().toString();             //使用getClass()方法查看
    }
}
