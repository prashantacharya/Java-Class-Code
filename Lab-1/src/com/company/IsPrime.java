package com.company;

public class IsPrime {
    public static void main(String[] args) {
        int number = 11, count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println(number + " is prime");
        else
            System.out.println(number + " is not prime");
    }
}
