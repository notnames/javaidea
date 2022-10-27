package io.notnames.demo;

/**
 * 使用方法，计算1-n的和
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("0-5的和为：" + add(5));
        System.out.println("--------");
        System.out.println("0-100的和为：" + add(100));
    }
    public static int add(int n) {
        int add = 0;
        for (int i = 0; i <= n; i++) {
            add += i;
        }
        return add;
    }

}
