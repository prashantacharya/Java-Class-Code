public class AreaOfCircle {
    public static void main(String[] args) {
        int r = 10;
        final double PI = 3.14;

        double area = PI * r * r;

        System.out.println(String.format("The area of circle with radius %d is %f.", r, area));
    }
}
