
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator implements ActionListener, KeyListener {
    JButton[] numbers = new JButton[10];
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton div = new JButton("/");
    JButton mult = new JButton("*");
    JButton equ = new JButton("=");
    JButton dot = new JButton(".");
    JFrame frame = new JFrame("Calculator");
    JTextArea text = new JTextArea();
    //JTextArea name = new JTextArea("Simple calculator");
    boolean fin = false;
    Calculator() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        for (int i = 0; i<10; i++) {
            numbers[i] = new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);
        }
        text.addKeyListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        dot.addActionListener(this);
        equ.addActionListener(this);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(10, 10, 10, 10);
        c.ipady = 50;
        c.weightx = 1.0;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        frame.add(text, c);
        c.insets = new Insets(20, 20, 30, 20);
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridy = 1;
        frame.add(numbers[7], c);
        c.gridx = 1;
        frame.add(numbers[8], c);
        c.gridx = 2;
        frame.add(numbers[9], c);
        c.gridx = 3;
        frame.add(div, c);
        c.gridy = 2;
        c.gridx = 0;
        frame.add(numbers[4], c);
        c.gridx = 1;
        frame.add(numbers[5], c);
        c.gridx = 2;
        frame.add(numbers[6], c);
        c.gridx = 3;
        frame.add(mult, c);
        c.gridy = 3;
        c.gridx = 0;
        frame.add(numbers[1], c);
        c.gridx = 1;
        frame.add(numbers[2], c);
        c.gridx = 2;
        frame.add(numbers[3], c);
        c.gridx = 3;
        frame.add(minus, c);
        c.gridy = 4;
        c.gridx = 0;
        frame.add(numbers[0], c);
        c.gridx = 1;
        frame.add(dot, c);
        c.gridx = 2;
        frame.add(equ, c);
        c.gridx = 3;
        frame.add(plus, c);
        frame.setSize(new Dimension(400, 500));
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == dot)text.append(".");
        else if(source == plus) {text.append("+"); fin = false;}
        else if(source == minus) {text.append("-"); fin = false;}
        else if(source == mult) {text.append("*"); fin = false;}
        else if(source == div) {text.append("/"); fin = false;}
        else if(source == equ) {text.setText(count(text.getText())); fin = true;}
        else {
            if (!fin) {
                if(source == numbers[0])text.append("0");
                else if(source == numbers[1])text.append("1");
                else if(source == numbers[2])text.append("2");
                else if(source == numbers[3])text.append("3");
                else if(source == numbers[4])text.append("4");
                else if(source == numbers[5])text.append("5");
                else if(source == numbers[6])text.append("6");
                else if(source == numbers[7])text.append("7");
                else if(source == numbers[8])text.append("8");
                else if(source == numbers[9])text.append("9");
            } else {
                if(source == numbers[0])text.setText("0");
                else if(source == numbers[1])text.setText("1");
                else if(source == numbers[2])text.setText("2");
                else if(source == numbers[3])text.setText("3");
                else if(source == numbers[4])text.setText("4");
                else if(source == numbers[5])text.setText("5");
                else if(source == numbers[6])text.setText("6");
                else if(source == numbers[7])text.setText("7");
                else if(source == numbers[8])text.setText("8");
                else if(source == numbers[9])text.setText("9");
                fin = false;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '\n') {text.setText(count(text.getText())); fin = true; return;}
        else if (!(e.getKeyChar() == '+' ||e.getKeyChar() == '-'||e.getKeyChar() == '*'||e.getKeyChar() == '/') && fin) {
            text.setText("");
        }
        fin = false;
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public String count(String s) {
        ArrayList<String> ops, nums;
        Pattern p = Pattern.compile("(\\d+\\.*\\d*)( *([+\\-*/]) *(\\d+\\.*\\d*))+");
        Matcher m = p.matcher(s.replace("\n", ""));
        String res = "Error";
        if (m.matches()) {
            nums = new ArrayList<String>(List.of(s.split("[^0-9.]")));
            nums.removeAll(List.of("", "\n", " "));
            ops = new ArrayList<String>(List.of(s.split("[0-9. ]")));
            ops.removeAll(List.of("", "\n", " "));
            ArrayList<Integer> first = new ArrayList<Integer>(), second = new ArrayList<Integer>();
            //System.out.println(nums + " " + ops);
            for (int i = 0; i<ops.size(); i++) {
                if ((ops.get(i).equals("*") || ops.get(i).equals("/"))) {
                    first.add(i);
                } else {
                    second.add(i);
                }
            }
            //System.out.println(first + " " + second);
            for (int j = 0; j < first.size(); j++) {
                int i = first.get(j);
                switch (ops.get(i)) {
                    case "*" -> {
                        nums.set(i, String.valueOf(Double.parseDouble(nums.get(i)) * Double.parseDouble(nums.get(i + 1))));
                        nums.remove(i + 1);
                    }
                    case "/" -> {
                        nums.set(i, String.valueOf(Double.parseDouble(nums.get(i)) / Double.parseDouble(nums.get(i + 1))));
                        nums.remove(i + 1);
                    }
                }
                ops.remove(i);
                first = lower(first, i);
                second = lower(second, i);
                //System.out.println(nums + " " + first + " " + second);
            }
            for (int j = 0; j < second.size(); j++) {
                int i = second.get(j);
                switch (ops.get(i)) {
                    case "+" -> {
                        nums.set(i, String.valueOf(Double.parseDouble(nums.get(i)) + Double.parseDouble(nums.get(i + 1))));
                        nums.remove(i + 1);
                    }
                    case "-" -> {
                        nums.set(i, String.valueOf(Double.parseDouble(nums.get(i)) - Double.parseDouble(nums.get(i + 1))));
                        nums.remove(i + 1);
                    }
                }
                ops.remove(i);
                second = lower(second, i);
                //System.out.println(nums + " " + first + " " + second);
            }
            res = nums.get(0);
        }
        return res;
    }

    public ArrayList<Integer> lower(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<arr.size(); i++) {
            res.add(arr.get(i));
            if (arr.get(i) > n) {
                res.set(i, res.get(i)-1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}