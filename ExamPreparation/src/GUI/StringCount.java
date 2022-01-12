package GUI;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringCount extends JFrame implements ActionListener {
    JTextField str;

    StringCount() {
        str = new JTextField(20);
        JButton submitButton = new JButton("Display Count");

        str.setBounds(100, 100, 50, 50);
        str.setBorder(new LineBorder(Color.BLACK, 2));

        add(str);
        add(submitButton);

        submitButton.addActionListener(this);

        setTitle("String count");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StringCount();
    }

    public void actionPerformed(ActionEvent e) {
        String text = str.getText();
        JOptionPane.showMessageDialog(this, text + text.length());
    }
}
