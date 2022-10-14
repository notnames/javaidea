package io.notnames.loop;

public class WhileTest61 {
    public static void main(String[] args) {
//        int first = 1;
//        int add = 3;
//        int for1 = 8;
//        int last = first;
//        for (int i=1;i <= 8;i++) {
//            first *= 2;
//        }
//        System.out.println(first);

        // 在while循环中嵌套if选择性更改循环变化条件

        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                i += 9;
                System.out.println(i);
            } else if (i % 2 == 1) {
                i += 11;
                System.out.println(i);
            } else {
                i = 101;
                System.out.println(i);
            }
        }


    }
}
