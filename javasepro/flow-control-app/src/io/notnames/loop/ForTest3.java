package io.notnames.loop;

public class ForTest3 {
    public static void main(String[] args) {

        int sum = 0;        //定义sum接受奇数和

        for (int i = 1; i <= 10 ; i++) {
            // i -> 1 2 3 4 5 6 7 8 9 10

            if (i % 2 == 1) {
                //  i -> 1 3 5 7 9

                sum += i;       //奇数做累加和
            }
        }
        System.out.println(sum);    //输出奇数和的结果

        System.out.println("--------------");

        int sum1 = 0;

        for (int i = 1; i <= 10; i += 2) {
            //i = 1 3 5 7 9
            sum1 += i;
        }
        System.out.println(sum1);


    }
}
