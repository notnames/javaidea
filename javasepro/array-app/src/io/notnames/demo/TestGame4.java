package io.notnames.demo;

import java.util.Random;
import java.util.Scanner;

public class TestGame4 {
    public static void main(String[] args) {
        // 动态定义5名员工id，键盘录入
        // 先输出一次正常顺序的id
        // for循环依次取出id，使用随机数存入任意数组位置
        // 输出，展示乱序的员工id
        int[] codes = new int[5];
        int l = codes.length;                       // 记录数组的长度
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < l; i++) {
            System.out.println("请输入第" + (i + 1) + "名员工id，总共5名");
            codes[i] = sc.nextInt();                // 键盘录入员工id
        }
        System.out.println("此次录入的员工id为：");
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");      // 先输出一次录入的id顺序
        }
        System.out.println();
        System.out.println("正在打乱排序，请稍后！");

        //使用for循环，遍历一遍数组，并打乱元素顺序
        Random r = new Random();
        for (int i = 0; i < l; i++) {
            int ra = r.nextInt(l);                 // 生成长度为数组的长度，0-4的随机数，对应着数组索引值

            // 设置临时变量temp，暂存a[i]数值，为数值交换做准备
            int temp = codes[i];
            codes[i] = codes[ra];
            codes[ra] = temp;
        }

        // 输出打乱排序后的结果
        System.out.println("打乱顺序之后的id排序为：");
        for (int i = 0; i < l; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
