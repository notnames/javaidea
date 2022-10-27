package io.notnames.demo;

public class TestGame5 {
    public static void main(String[] args) {
        // 冒泡排序
        // 定义一个待排序的数组
        // 静态初始化数组（可采用动态初始化）
        int[] arr = {5, 3, 1, 2};

        // 遍历一遍数组，需要操作的元素个数为数组长度-1，每个元素需要操作的次数为数组长度-操作次数（注意初始值是0还是1）
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0, 1, 2 次数
            // 数组各个元素，每一次遍历都需要进行，数组长度-遍历次数-1，次的交换操作
            for (int i1 = 0; i1 < arr.length - i - 1; i1++) {
                // 第i次操作次数 ==》 3， 2， 1
                // if分支做判断，将较大值与后一个元素交换位置
                // 使用临时变量temp存储需要交换的下一个元素
                if (arr[i1] > arr[i1 + 1]) {
                    int temp = arr[i1 + 1];
                    arr[i1 + 1] = arr[i1];
                    arr[i1] = temp;
                }
            }
        }

        // 遍历数组，输出排序后的结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
