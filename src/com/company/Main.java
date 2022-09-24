package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[10];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        double[] copyArr = new double[10];

        System.out.println("Copied Array");
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = arr[i];
            System.out.print(copyArr[i] + " ");
        }
    }
}
