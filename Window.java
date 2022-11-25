import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window implements MouseListener {
    JFrame frame = new JFrame("Regions");
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel west = new JPanel();
    JPanel east = new JPanel();
    JPanel center = new JPanel();
    JPanel[] regions = new JPanel[]{north, south, east, west, center};
    RegionDialog dial = new RegionDialog(frame);
    Window() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame. setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        frame.setSize(500,  500);
        north.setBackground(Color.lightGray);
        south.setBackground(Color.cyan);
        east.setBackground(Color.PINK);
        west.setBackground(Color.YELLOW);
        center.setBackground(Color.ORANGE);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.weightx = 0.5;
        c.weighty = 0.5;
        frame.add(north, c);
        //c.fill = GridBagConstraints.NONE;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        frame.add(west, c);
        c.gridx = 2;
        c.gridy = 1;
        frame.add(center, c);
        c.gridx = 3;
        c.gridy = 1;
        frame.add(east, c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 4;
        frame.add(south, c);
        frame.setEnabled(true);
        for (JPanel pane : regions) pane.addMouseListener(this);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == north) {
            dial.text.setText("Добро пожаловать в САО");
            dial.setVisible(true);
        }
        if (e.getSource() == south) {
            dial.text.setText("Добро пожаловать в ЮАО");
            dial.setVisible(true);
        }
        if (e.getSource() == west) {
            dial.text.setText("Добро пожаловать в ЗАО");
            dial.setVisible(true);
        }
        if (e.getSource() == east) {
            dial.text.setText("Добро пожаловать в ВАО");
            dial.setVisible(true);
        }
        if (e.getSource() == center) {
            dial.text.setText("Добро пожаловать в ЦАО");
            dial.setVisible(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public static void main(String[] args) {
        new Window();
    }
}