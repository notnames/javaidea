package io.notnames.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 拆分
        int data = 432;

        int ge = data % 10;
        int shi = data / 10 % 10;
        int bai = data / 100;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
