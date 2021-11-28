package com.company;

class ComplexNumber {
    public int real, imaginary;

    ComplexNumber() {
    }

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber sum(ComplexNumber C1, ComplexNumber C2) {
        ComplexNumber res = new ComplexNumber();

        res.real = C1.real + C2.real;
        res.imaginary = C1.imaginary + C2.imaginary;

        return res;
    }

    public static void print(ComplexNumber C) {
        System.out.printf("%d + %di", C.real, C.imaginary);
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        ComplexNumber C1 = new ComplexNumber(1, 2);
        ComplexNumber C2 = new ComplexNumber(5, 7);

        ComplexNumber res = ComplexNumber.sum(C1, C2);

        ComplexNumber.print(res);
    }
}
