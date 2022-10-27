package io.notnames.create;
/**
        关于”方法“的简单使用
        例子：sum()方法
        提高了代码的复用性
        让程序的逻辑更清晰
*/

public class MethodDemo1 {
    public static void main(String[] args) {
        // 甲做加法运算
        int c = sum(10,30);
        System.out.println(c);

        // 乙做三次输出Hello World!
        print();

    }
    // 以下定义了有形参的方法
    public static int sum(int a,int b) {
        return a + b;
    }
    // 以下方法不需要传入参数，也没有返回值
    // 所以类型申明用void  （无返回值）
    // 并且内部不可以使用return
    public static void print() {
        for (int i = 0;i < 3;i++) {
            System.out.println("Hello World！");
        }
    }
}
