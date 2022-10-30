package io.notnames.create;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 定义数组
        // 数据类型[] 数组名 = new 数据类型[] {元素1,元素2...};
//        double[] scores1 = new double[] {63.5,74,63.5,95};
        // 简化写法：
        // 数据类型[] 数组名 = {元素1,元素2...};
//        double[] scores = {63.5,74,63.5,95};

        // 例子
        int[] data = {1,3,5,7,9};
        String[] names = {"张三","李四"};

        // 数组不是直接存数据，而是存一个地址，直接打印数组会返回地址
        System.out.println(names);

        // 那么，怎么取数据呢
        // 数组名[索引]，可以返回单个数据
        System.out.println(names[1]);

        //数组赋值,修改某个索引对应的数据
        names[1] = "王五";
        System.out.println(names[1]);

        //返回数组的长度（个数）
        System.out.println(names.length);
        System.out.println(data.length);

        // 以下定义数组的方式都是可以的
        int[] age = {34,23};
        int age1[] = {23,43};

    }
}
