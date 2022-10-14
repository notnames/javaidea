package io.notnames.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
        int okPassdord = 520;
        Scanner sc = new Scanner(System.in);
        int returnnum = 0;
        int count = 0;
        while (true) {
            count++;
            System.out.println("请输入密码：");
            int password = sc.nextInt();
            if (password == okPassdord) {
                returnnum = 1;
                System.out.println("登录成功!");
                break;
            } else if (count >= 5) {
                System.out.println("超过次数，请重试");
                break;
            } else {
                System.out.println("密码错误！");
            }
        }
        System.out.println("尝试密码次数：" + count);
        System.out.println(returnnum);
    }
}
