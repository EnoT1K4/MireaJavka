import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame{
    JTextField jta1 = new JTextField(9);
    JTextField jta2 = new JTextField(9);
    JButton button = new JButton("+");
    JButton button1 = new JButton("-");
    JButton button2 = new JButton("*");
    JButton button3 = new JButton("/");

    Font fnt = new Font("Helvetica",Font.LAYOUT_LEFT_TO_RIGHT,20); //начало конструктора класса LabExample
    LabExample() {

        super("Calculator 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 180);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопку
        add(button);
        add(button1);
        add(button2);
        add(button3);
        //добавляем слушателя к кнопке
        button.addActionListener((ActionListener) (Action) -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Answer", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
            }
        });
        button1.addActionListener((ActionListener) (Action) -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Answer", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
            }
        });
        button2.addActionListener((ActionListener) (Action) -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Answer", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
            }
        });
        button3.addActionListener((ActionListener) (Action) -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Answer", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
            }
        });

    setVisible(true);
}
    public static void main(String[]args){
    new LabExample();
    }
}
