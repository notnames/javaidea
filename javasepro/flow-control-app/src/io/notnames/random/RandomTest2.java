package io.notnames.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        //猜数字游戏
        //随机生成1-100的随机数，输入一个数字，大了提示‘大’，小了提示‘小’，猜中就结束。

        //1.先生成1-100的随机数
        System.out.println("正在生成幸运数字（1-100）");
        Random r = new Random();
        int data = r.nextInt(100) + 1;
        System.out.println("幸运数字已经生成！");

        //2.提示用户输入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("您有8次机会输入您的数字，请好好把握机会！");
        System.out.println("请输入您所猜测的幸运数字（0-100）：");

        //3.if分支判断该数字大小，并提示
        int count = 0;      //记录猜测次数
        while (true) {
            //2.然后指定用户输入数字
            int test = sc.nextInt();
            count++;
            if (count > 8) {       // 次数限制为10次以内
                System.out.println("您猜的太多次啦！游戏结束！");
            } else if (test > 100 || test < 1) {       //非目标数字判断
                System.out.println("请输入1-100之间的数字！");
            } else if (test == data) {
                System.out.println("猜对啦！");
                break;
            } else if (test >= data) {
                System.out.println("太大啦！");
            } else if (test <= data) {
                System.out.println("太小啦！");
            } else {
    // 异常处理，但是没什么用，因为输入非数字格式的数字时，程序会直接报错并退出，此行代码并未起到作用
                System.out.println("数据异常！！！");
            }
            System.out.println("您还剩下" + (10 - count) + "次机会！");
        }
        System.out.println("您猜对此次幸运数字所用次数为：" + count);
    }
}
