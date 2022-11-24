import java.util.StringTokenizer;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner scanner = new Scanner(System.in);
        String toParse = scanner.nextLine();
        System.out.println("Enter delim");
        String delim = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(toParse,delim);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
