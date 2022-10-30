package io.notnames.random;

import java.util.Random;

public class RandomDemo3 {
    public static void main(String[] args) {

        // 其实，java已经提供了在某一区间的随机数的简易写法，包含在其父类中，可以直接使用
        // 以下使用了区间直接生成了随机数
        // 这样子就不用再自己加减法计算了

        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            int data = r.nextInt(10,31);
            System.out.println(data);
        }
    }
}
