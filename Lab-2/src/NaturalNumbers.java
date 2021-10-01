public class NaturalNumbers {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        int sum = n * (n + 1) / 2;
        System.out.println("Sum: " + sum);
    }
}
