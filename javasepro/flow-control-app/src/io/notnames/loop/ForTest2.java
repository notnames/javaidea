package io.notnames.loop;

public class ForTest2 {
    public static void main(String[] args) {
        //计算1-5累加和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(sum + i);
            sum += i;
        }
        System.out.println(sum);
    }
}
