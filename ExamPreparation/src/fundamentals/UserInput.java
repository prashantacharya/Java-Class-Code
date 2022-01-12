package fundamentals;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name and age?");
        String name = sc.nextLine();

        int age = sc.nextInt();

        System.out.printf("Hi, %s. You are %d years old.\n", name, age);
    }
}
