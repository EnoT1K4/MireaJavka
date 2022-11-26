
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import static java.lang.System.exit;

public class Game {
    int num = new Random().nextInt(21), tries=0;
    JButton tryButton = new JButton("Угадать");
    JTextField answField = new JTextField(10);
    JPanel[] pan = new JPanel[6];
    JFrame frame = new JFrame("Угадайка!");

    Game() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame. setLayout(new GridLayout(3, 2));
        frame.setSize(500,  500);
        for (int i = 0; i<6; i++) {pan[i] = new JPanel(); pan[i].setLayout(new FlowLayout()); frame.add (pan[i]);}
        //BorderLayout.CENTER
        pan[2].add(tryButton);
        pan[3].add(answField);
        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answ = Integer.parseInt(answField.getText());
                if (answ == num) {
                    JOptionPane.showMessageDialog(null, "Вы угадали!","Alert", JOptionPane.INFORMATION_MESSAGE);
                    exit(0);
                }
                tries++;
                if (tries == 3) {
                    JOptionPane.showMessageDialog(null, "Попытки закончились, вы не смогли угадать. Правильный ответ: ","Alert", JOptionPane.INFORMATION_MESSAGE);
                    exit(0);
                }
                else {
                    JOptionPane.showMessageDialog(null, ("Неверно. Загаданное число " + ((answ<num) ? "больше" : "меньше" ) + " (" + (3-tries) + "/3)"), "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        System.out.println(num);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Game();
    }

}