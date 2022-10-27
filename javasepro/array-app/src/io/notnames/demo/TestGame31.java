package io.notnames.demo;

import java.util.Random;
import java.util.Scanner;

public class TestGame31 {
    public static void main(String[] args) {

        // 此为优化版本，优化了死循环内嵌套循环时间
        // 嵌套循环直接结束整个死循环，不用一层层退出嵌套的循环
        // 很使用，减少代码量


        // 随机生成1-20中的5个数字（可重复），让用户猜测数字
        // 没有猜中提示：“未命中”，并继续猜测
        // 猜中提示： “猜中了！恭喜！”
        // 并且输出该数字的首次出现位置（可能有重复数字）
        // 并且将5个数字全部输出，然后结束游戏
        System.out.println("系统将随机生成1-20中的5个数字，输入数字后回车，即可确认本次猜测的数字");
        System.out.println("正在生成幸运数字，请稍后！");

        int[] a = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            a[i] = r.nextInt(20) + 1;
        }
        System.out.println("幸运数字已经生成！");
        Scanner sc = new Scanner(System.in);

        OUT:                                                // 先在外部定义结束整个死循环的OUT
        while (true) {
            System.out.println("请输入您所猜测的数字：");
            int num = sc.nextInt();
//            boolean t = true;                             // xxx

            for (int i = 0; i < a.length; i++) {
                if (num == a[i]) {
                    System.out.println("猜对啦！恭喜！");
                    System.out.println("您所猜测的数字在五个数字的第" + (i + 1) + "个位置");
                    System.out.println("此次生成的幸运数字是：");
                    for (int i1 = 0; i1 < a.length; i1++) {
                        System.out.print(a[i1] + " ");
                    }
//                    t = false;                            // xxx
//                    break;                        // 不用break;来结束本次小循环
                    break OUT;                      // 而是直接使用break OUT;结束整个大的死循环
                }
            }
//            if (t == false) {                             // xxx
//                break;
//            }else {
                System.out.println("猜错啦！");
//            }
        }



    }
}
