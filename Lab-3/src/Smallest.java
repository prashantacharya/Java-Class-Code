public class Smallest {
    int smallestNum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Smallest sm = new Smallest();

        System.out.println(sm.smallestNum(10, 2, 3));
    }
}
