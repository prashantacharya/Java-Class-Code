public class Digits {
    int sumOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            int t = num % 10;
            sum += t;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Digits d = new Digits();

        System.out.println(d.sumOfDigits(123));
    }
}
