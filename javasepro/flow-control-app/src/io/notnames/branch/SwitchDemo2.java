package io.notnames.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {

        //  switch值匹配

        //需求： 早上（散步），中午（吃饭），下午（跑步），晚上（睡觉）

        String day = "下午";      //当前

        switch (day) {
            case "早上":
                System.out.println("散步");
                break;
            case "中午":
                System.out.println("吃饭");
                break;
            case "下午":
                System.out.println("跑步");
                break;
            case "晚上":
                System.out.println("睡觉");
                break;
            default:
                System.out.println("数据有误！");
        }
        System.out.println("正在进行中！");
    }
}
