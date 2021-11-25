package com.company;

public class ReadString {
    public static void main(String[] args) {
        String name = "Prashant";
        try {
            for (int i = 0; i <= name.length(); i++) {
                System.out.print(name.charAt(i));
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}
