import java.util.*;
import java.util.Scanner;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.Runnable;
import javax.swing.Action;

public class PR6_1 {
    public static void main(String[] args) {
        Book B1 = new Book("A");
        Book B2 = new Book("B");
        Book B3 = new Book("C");
        B1.print();

        Shop S1 = new Shop("Shop1");
        Shop S2 = new Shop("Shop2");
        S1.print();

        System.out.println("\n");

        Vector<Printable> V1 = new Vector<>();
        V1.addElement(B1);
        V1.addElement(B2);
        V1.addElement(B3);
        V1.addElement(S1);
        V1.addElement(S2);
        for (int i = 0; i < V1.size(); i++) {
            V1.get(i).print();
        }

    }
}

