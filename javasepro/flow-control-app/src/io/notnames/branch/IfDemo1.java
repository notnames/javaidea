package io.notnames.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // 需求：检查心跳（60-100）之间正常，否则报错

        int heartBeat = 63;
        if (heartBeat < 60 ||heartBeat > 100) {
            System.out.println("当前" + heartBeat + "非正常的");
        }
        System.out.println("检查结束");

        System.out.println("------发红包--------");

        //需求： 发红包
        //钱包金额
        double money = 400;
        //发送1314红包
        double h = 1314;
        if (money >= h) {
            System.out.println("有" + money);
            money -= h;
            System.out.println("成功发送，当前剩余" + money);
        }else {
            System.out.println("有" + money);
            System.out.println("钱包不足");
            System.out.println("发送失败，当前剩余" + money);
        }
        System.out.println("------分数--------");

        //需求：分数（0-60）不及格，（60-80）及格，（80-100）毕业

        int score = 88;         //我的分数

        System.out.println("当前分数：" + score);
        if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else if (score >= 60 && score < 80) {
            System.out.println("及格");
        } else if (score >= 80 && score <= 100) {
            System.out.println("毕业");
        }else {
            System.out.println("分数有误，请检查分数是否出错！");
        }

    }
}
