import java.security.SecureRandom;

public class KeyGenerator {

    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateKey() {
        return part() + "-" + part() + "-" + part() + "-" + part();
    }

    private static String part() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int idx = RANDOM.nextInt(CHARS.length());
            sb.append(CHARS.charAt(idx));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateKey());
    }
}
