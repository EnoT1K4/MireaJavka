import java.util.regex.*;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        //String text = "a) пример правильных выражений: 25.98 USD.\n" +
                //"b) пример неправильных выражений: 44 ERR, 0.004 EU.";
        Pattern pattern = Pattern.compile("[0-9]+[.,][0-9][0-9]\\s(EU|USD|RUB)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            System.out.println(matcher.group());
    }

}
