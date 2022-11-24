
import java.util.Scanner;
import java.util.Vector;
import java.util.*;

public class testMag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InetMag.Store S1 = new InetMag.Store(); // Создаём магаз
        int Quit = 1;
        do {

            InetMag.Store.generateProducts(); // Вывод товаров
            System.out.println("\nЧто хотите купить?");
            int N = in.nextInt();


            System.out.println("\nВ какой валюте приобретёте товар?\n" +
                    "(RUB, USD, EUR)");
            String val = in.next();
            double valDub = S1.inVal(val, N);// Функция по выбору нужного метода класса, возвращая стоимость в нужной валюте
            System.out.printf("\nВ %s будет стоить: %.2f", val, valDub);

            System.out.println("\nОплатить?"); // YES/NO
            String Rem = in.next();
            if (Rem.equals("Yes")) {
                S1.Buy(N);
                System.out.print("Продукт куплен.");
            }

            System.out.println("\nЕщё что-нибудь купите?");
            String QuitStr = in.next();
            if (QuitStr.equals("Yes")) {
                Quit = 1;
            } else {
                Quit = 0;
            }
        }
        while (Quit != 0);
        System.out.print("\nМагазин закрыт!!.");

        System.out.println("\nДо свидания!");

    }
}
