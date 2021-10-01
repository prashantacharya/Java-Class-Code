public class MidCharString {
    char midChar(String s) {
        int midPos = s.length() / 2;
        return s.charAt(midPos);
    }

    public static void main(String[] args) {
        MidCharString s = new MidCharString();
        System.out.println(s.midChar("PRASHANT"));
    }
}
