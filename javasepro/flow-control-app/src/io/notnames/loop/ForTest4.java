package io.notnames.loop;

public class ForTest4 {
    public static void main(String[] args) {
        // 水仙花数的计算
        // 一个三位数，个位、十位、百位的数字立方等于原数
        // 先拿出100-999的三位数
        int sum = 0;        //记录水仙花数的数量
        for (int i = 100;i <= 999;i++) {
            // 提取数字的各位的数
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            // if判断，计算相等就输出
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + "\t");
//                System.out.println(i);
                sum++;
            }
        }
        System.out.println();
        System.out.println("水仙花数的个数是" + sum);
    }
}
