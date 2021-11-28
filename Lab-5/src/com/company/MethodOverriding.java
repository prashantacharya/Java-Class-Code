package com.company;

class Rectangle {
    public int l, b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int area() {
        return l * b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }
}

class Square extends Rectangle {
    public int l;

    public Square(int l) {
        super(l, l);
        this.l = l;
    }

    public int area() {
        return l * l;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Square s = new Square(5);

        System.out.printf("The area of square is %d and perimeter is %d.", s.area(), s.perimeter());
    }
}
