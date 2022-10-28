package io.notnames.param;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        printArray(arr);                    // 正常测试数组方法
        System.out.println("---------");
        int[] arr1 = null;                  // 测试空数组方法调用
        printArray(arr1);
    }
    public static void printArray(int[] arr) {
        System.out.print("数组为：");
        System.out.print("[");
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
