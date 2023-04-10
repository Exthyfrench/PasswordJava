import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/";

    public static void main(String[] args) {
        int length = 12; // length of the password
        String password = generatePassword(length);
        System.out.println("Random password: " + password);
    }

    private static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // generate random characters from different categories
        for (int i = 0; i < length; i++) {
            int category = random.nextInt(4);
            switch (category) {
                case 0: // lowercase
                    password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
                    break;
                case 1: // uppercase
                    password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
                    break;
                case 2: // numbers
                    password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
                    break;
                case 3: // special characters
                    password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));
                    break;
            }
        }

        return password.toString();
    }
}

