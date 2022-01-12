import javax.swing.*;

public class Event {
    public static void main(String[] args) {
        Event EventApp = new Event();
        EventApp.createGUI();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Java Swing Example");
        frame.setSize(500, 500);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        okButton.setActionCommand("OK");
        cancelButton.setActionCommand("Cancel");

        frame.add(okButton);
        frame.add(cancelButton);

    }
}
