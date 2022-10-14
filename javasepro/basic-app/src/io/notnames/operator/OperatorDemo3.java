package io.notnames.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //  符号‘+’做连接符。能算则算，不能算就在一起
        int a = 5;
        String data = "苹果";

        System.out.println(a + a);
        System.out.println(a + 'a');
        System.out.println(data + data);
        System.out.println(data + a);
        System.out.println("data" + 'a');
        System.out.println("data" + a);
        System.out.println(data + 'a');

        System.out.println("我有" + a + "个"
                + data + "，因为我" +
                "特别喜欢吃" +
                data);



    }
}
