

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Window implements ActionListener {
    JFrame frame = new JFrame("File");
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JTextArea text = new JTextArea();
    JMenuBar bar = new JMenuBar();
    JMenu file = new JMenu("File"), edit = new JMenu("Edit"), help = new JMenu("Help");
    JMenuItem fSave = new JMenuItem("Save"), fClose = new JMenuItem("Close"), eCopy = new JMenuItem("Copy"), eCut = new JMenuItem("Cut"), ePaste = new JMenuItem("Paste");
    JPanel[] pan = new JPanel[2];
    Window() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gl = new GridLayout(2,1);
        for (int i = 0; i<2; i++) {pan[i] = new JPanel(); pan[i].setLayout(new FlowLayout()); frame.add(pan[i]);}
        frame.setLayout(gl);
        file.add(fSave);file.add(fClose);
        edit.add(eCopy); edit.add(eCut); edit.add(ePaste);
        bar.add(file); bar.add(edit); bar.add(help);
        fSave.addActionListener(this);
        fClose.addActionListener(this);
        eCopy.addActionListener(this);
        eCut.addActionListener(this);
        ePaste.addActionListener(this);
        //btn1.setSize(20, 30);
        //btn2.setSize(20, 30);
        //gl.setHgap(20);
        //gl.setVgap(20);
        pan[0].add(btn1); pan[0].add(btn2);
        //gl.setHgap(0);
        //gl.setVgap(0);
        text = new JTextArea(10,40);
        text.setLineWrap(true);
        //text.set
        JScrollPane areaScrollPane = new JScrollPane(text);
        areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pan[1].add(text);
        frame.setJMenuBar(bar);
        frame.setSize(new Dimension(500, 400));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == fSave) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt"))) {
                writer.write(text.getText());
                System.out.println("File was saved to this project's folder and is named newfile.txt. No, you do not get to choose.");
            } catch (IOException i) {
                System.out.println("Cannot write file...");
            }
        }
        else if (e.getSource() == fClose) frame.dispose();
        else if (source == eCopy) text.copy();
        else if (source == eCut) text.cut();
        else if (source == ePaste) text.paste();
        else if (source == help) JOptionPane.showMessageDialog(null, "There is no help here, only suffering","Help",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Window();
    }
}