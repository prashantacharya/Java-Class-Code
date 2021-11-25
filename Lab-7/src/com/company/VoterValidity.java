package com.company;

public class VoterValidity {
    void checkAgeValidity(int age) {
        try {
            if (age < 18) {
                throw new Exception("Voter must be 18");
            }

            System.out.println("You can vote");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Age verified. Verify next voter.");
        }
    }

    public static void main(String[] args) {
        VoterValidity v = new VoterValidity();
        v.checkAgeValidity(17);
    }
}
