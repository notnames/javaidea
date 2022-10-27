package io.notnames.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(10);

        for (int i = 0; i < 10; i++) {

        }
        System.out.println(data);
    }
}
