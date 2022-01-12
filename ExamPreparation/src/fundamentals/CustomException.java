package fundamentals;

class AgeLimitException extends Exception {
    AgeLimitException(String message) {
        super(message);
    }
}

public class CustomException {
    public static boolean checkAge(int age) throws AgeLimitException {
        if (age > 18) return true;

        throw new AgeLimitException("Cannot vote");
    }

    public static void main(String[] args) {
        try {
            boolean ageLimitValiditiy = checkAge(17);

            if (ageLimitValiditiy) {
                System.out.println("Allowed to vote");
            }
        } catch (AgeLimitException e) {
            System.out.println(e.getMessage());
        }
    }
}
