package io.test;

public class test1 {
    public static void main(String[] args) {
        // 定义数组，输出数组内的与其索引对应相同的数值
        // 例子：a[1,1,3,2,4,5]    -->     [1,4,5]

        int[] a = {1,1,3,2,4,5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i) {
                System.out.print(a[i] + ",");
            }
        }
    }
}
