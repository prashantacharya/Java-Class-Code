package com.company;

public class OverloadedAdd {
    static String add(String a, String b) {
        return a + b;
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 13;
        String str1 = "Prashant ", str2 = "Acharya";

        System.out.printf("The sum of %d and %d is %d.\n", num1, num2, add(num1, num2));
        System.out.printf("The concatenation of '%s' and '%s' is '%s'.\n", str1, str2, add(str1, str2));
    }
}
