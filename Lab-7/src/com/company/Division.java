package com.company;

public class Division {
    void division(float a, float b) {
        try {
            if (b == 0) throw new ArithmeticException("Division by 0 error");
            float res = a/b;
            System.out.println("THe result is: " + res);
        } catch (ArithmeticException error) {
            System.out.println(error);
        }
    }

    public static void main(String[] args) {
        Division d = new Division();

        d.division(10, 0);
    }
}
