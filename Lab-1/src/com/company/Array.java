package com.company;

public class Array {
    public static void main(String[] args) {
        double[] numArray = new double[10];

        for (int i = 1; i < 11; i++) {
            numArray[i - 1] = i;
        }

        for (double num : numArray) {
            System.out.println(num);
        }
    }
}
