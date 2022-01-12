package GUI;

import javax.swing.*;
import java.awt.*;

public class SwingDemo extends JFrame {
    SwingDemo() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu saveAsMenu = new JMenu("Save as");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem pdfItem = new JMenuItem("pdf");
        JMenuItem pngItem = new JMenuItem("png");

        saveAsMenu.add(pdfItem);
        saveAsMenu.add(pngItem);


        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsMenu);

        jMenuBar.add(fileMenu);
        jMenuBar.add(viewMenu);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);

        setLayout(new FlowLayout());
        add(jMenuBar);
        add(jPanel);

        setTitle("First swing application");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
