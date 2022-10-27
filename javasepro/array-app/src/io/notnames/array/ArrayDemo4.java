package io.notnames.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 动态化定义数组
        // 先定义，后赋值（定义时，需要先确定数组的长度）
        // 数组类型[] 数组名 = new 数据类型[数组长度];
        // int[] arr = new int[3];      // 先定义
        // arr[0] = 15;                 // 后赋值

         int[] arr = new int[3];      // 先定义
         arr[0] = 15;                 // 后赋值
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
