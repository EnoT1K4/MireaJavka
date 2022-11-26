import java.util.regex.Pattern;

public class Seventh {
    public static void main(String[] args) {
        String[] test = {"kjve459348HJ", "MIrea@", "smart", "A"};
        // ?=.* - встречается хотя бы раз
        for (int i = 0; i < 4; i++) {
            System.out.println(Pattern.matches("^\\w+(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])\\w{7,}$", test[i]));
        }
    }
}
