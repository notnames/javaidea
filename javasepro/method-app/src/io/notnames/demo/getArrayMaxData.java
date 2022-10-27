package io.notnames.demo;

public class getArrayMaxData {

    public static void main(String[] args) {
        int[] arr = {12,34,65,32,7};
        int max = getArrayMaxData(arr);
        System.out.println(max);
    }
    public static int getArrayMaxData(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
