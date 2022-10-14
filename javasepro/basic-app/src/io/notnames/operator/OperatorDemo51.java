package io.notnames.operator;

public class OperatorDemo51 {
    public static void main(String[] args) {

        //  定义类型变量

        int i1 = 20;
        int i3 = 200;

        byte i2 = 10;
        byte i4 = 10;


//        short i5 = i1 + i2;       //报错，需要强制转换
        short i5 = (short) (i1 + i2);
        System.out.println("i5:" + i5);


        i2 += i1;       //等价于   i2 = (byte) i2 + i1
        i4 += i3;       //等价于   i4 = (byte) i4 + i3


        System.out.println(i2);
        System.out.println(i4);     //超出i4的byte类型约束，数据丢失

        //  调用方法打印变量类型
        System.out.println(getType(i2));        //转换为了byte
        System.out.println(getType(i4));        //转换为了byte
    }

    //  自定义查看变量类型的方法
    public static String getType(Object o) {        //获取变量类型的方法
        return o.getClass().toString();             //使用getClass()方法查看
    }

}
