package io.notnames.demo;

public class Test1 {
    public static void main(String[] args) {
        // 数组元素求和
        int[] a = {12,32,52,23,23};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
