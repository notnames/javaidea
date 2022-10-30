package io.notnames.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 数组的动态初始化
        // 只定义数据类型和数组长度，数据之后再存，此时会默认数组全部为‘0’
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[2]);

        // 后赋值
        arr[2] = 10;
        System.out.println(arr[2]);
    }
}
