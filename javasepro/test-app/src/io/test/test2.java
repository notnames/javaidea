package io.test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        // ...
        double a = 1.8 * 60 * 60;
        System.out.println(a * 4);


        int[] codes = {1,2,3,4,5};
        int l = codes.length;
        System.out.println(l);

        Random r = new Random(4);            // 0-4的随机数，对应着数组索引值
        for (int i = 0; i < l; i++) {
            int ra = r.nextInt();
            System.out.println(ra);
            int data = codes[i]; // 暂存a[i]数值
//            codes[i] = codes[ra];
//            codes[ra] = data;
        }
        for (int i = 0; i < l; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
