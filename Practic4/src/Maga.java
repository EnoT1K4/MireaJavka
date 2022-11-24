import java.util.*;
public class Maga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PR4C_1.Person pers = new PR4C_1.Person();
        String log, pass;
        System.out.println("Enter log and pass: \n");
        log = in.next();
        pass = in.next();
        if (pers.chekPers(log, pass)) {
            PR4C_1.Shop shop = new PR4C_1.Shop();
            shop.outGroups();
            String Group, Name;
            String Otv = "Yes";
            System.out.println("Enter group: \n");
            Group = in.next();
            shop.outProd(Group);
            do {
                System.out.println("Enter name of food");
                Name = in.next();
                shop.addBus(Name);
                System.out.println("Anyone else?");
                Otv = in.next();
            } while (!Objects.equals(Otv, "No"));
            shop.Buy();
            System.out.println("Go Away");
        }
        else {
            System.out.println("You miss");
        }
    }

}
