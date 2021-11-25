package com.company;

public class Person {
    public String name;
    public int age;
    public float salary;

    Person(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void printPerson() {
        System.out.println(String.format("Name: %s \nAge: %d\nSalary: %f", this.name, this.age, this.salary));
    }

    public static void main(String[] args) {
        Person p = new Person("Prashant", 22, 12345);
        p.printPerson();
    }
}
