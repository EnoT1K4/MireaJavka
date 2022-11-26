import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestFrame extends JFrame {

    public TestFrame() {

        super("Frame");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Times New Roman", Font.PLAIN, 18);

        String[] items = {
                "Australia",
                "China",
                "England",
                "Russia"
        };

        Container content = getContentPane();

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel("Choose country");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        ActionListener actionListener = e -> {
            JComboBox box = (JComboBox) e.getSource();
            String item = (String) box.getSelectedItem();
            label.setText(item + ", good country");
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(font);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);

        setPreferredSize(new Dimension(250, 150));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            new TestFrame();
        });
    }
}