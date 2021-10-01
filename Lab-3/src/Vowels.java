public class Vowels {
    int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            str = str.toLowerCase();
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Vowels v = new Vowels();
        String str = "HellO Prashant";

        int count = v.countVowels(str);

        System.out.println(count);
    }
}
