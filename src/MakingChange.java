import javax.swing.*;

public class MakingChange {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Making Change");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RegisterPanel panel = new RegisterPanel();
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
    }
}   // Runs the GUI version of the Lab; Can only handle one input at a time.