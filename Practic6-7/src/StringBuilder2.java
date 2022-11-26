import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Object;
import java.lang.StringBuilder;

public class StringBuilder2 {

    public String Buff;
    private String workStr;

    StringBuilder stringBuilder = new StringBuilder("Hi");

    public void Rev() {
        Buff = stringBuilder.toString();
        stringBuilder.reverse();
        System.out.print(stringBuilder);
        System.out.printf("  reverse string");
    }

    public void delel(int N) {
        Buff = stringBuilder.toString();
        stringBuilder.deleteCharAt(N);
        System.out.printf(" delete string");
    }
    public void undo() {
        stringBuilder = new StringBuilder(Buff);
    }
    public String toString() {
        return stringBuilder.toString();
    }
}
