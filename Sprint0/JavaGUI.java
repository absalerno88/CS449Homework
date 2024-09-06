import javax.swing.*;

public class JavaGUI {
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label = new JLabel("This is a label with text");
        label.setBounds(10, 20, 200, 25);
        panel.add(label);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 50, 380, 1);
        panel.add(separator);

        JCheckBox checkBox = new JCheckBox("Checkbox");
        checkBox.setBounds(10, 60, 200, 25);
        panel.add(checkBox);

        JRadioButton radioButton1 = new JRadioButton("Number 1");
        radioButton1.setBounds(10, 90, 100, 25);
        JRadioButton radioButton2 = new JRadioButton("Number 2");
        radioButton2.setBounds(10, 120, 100, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        panel.add(radioButton1);
        panel.add(radioButton2);
    }
}
