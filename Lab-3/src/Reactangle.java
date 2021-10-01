public class Reactangle {
    double area(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {
        Reactangle r = new Reactangle();

        System.out.println(r.area(10, 15));
    }
}
