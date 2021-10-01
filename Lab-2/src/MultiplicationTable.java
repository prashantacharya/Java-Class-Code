public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 10;

        for(int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d * %d = %d", num, i, num * i));
        }
    }
}
