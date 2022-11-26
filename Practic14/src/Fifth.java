import java.util.regex.Pattern;
public class Fifth {
    public static void main(String[] args) {
        StringBuilder feb = new StringBuilder();
        for (int i = 1900; i < 10000; i++) {
            if (i % 400 == 0) feb.append(i).append("|");
        }
        String text = "29/02/2000 30/04/2003 01/01/2003 29/02/2001 30-04-2003 1/1/1899";
        String[] test = text.split(" ");
        //Scanner in = new Scanner(System.in);
        //String text = in.nextLine();

        String p = "^((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/([2-9][0-9]{2}[0-9]|19[0-9]))$|" +
                "^((0[1-9]|[12][0-9]|30)|(3[01]/(0[469]|11)/([2-9][0-9]{2}[0-9]|19[0-9])))$|" +
                "^(29/02/(" + feb + "(19|[2-9][0-9])(0[48]|[2468][048]|[13579][26])))$|"
                + "^((0[1-9]|1[0-9]|2[0-8])/02/([2-9][0-9]{2}[0-9]|19[0-9]))$";
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + " " + Pattern.matches(p, test[i]));
        }
    }
}
