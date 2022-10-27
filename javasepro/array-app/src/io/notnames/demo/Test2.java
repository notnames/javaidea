package io.notnames.demo;

public class Test2 {
    public static void main(String[] args) {
        // 求数组的最值
        int[] numArr = {3,1,5,3,6,8};

        //max
        int max = numArr[0];
        for (int i = 0; i < numArr.length - 1; i++) {
            if (max < numArr[i + 1]) {
                max = numArr[i + 1];
            }
        }
        //min
        int min = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println("数组的最大值是：" + max);
        System.out.println("数组的最小值是：" + min);

    }
}
