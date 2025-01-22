import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends javax.swing.JPanel {
    Register register; // a register object to run the logic
    JPanel inputPanel;  // a panel to hold the JTextField for the user to enter an amount
    JTextField input;   // a place for the user to enter the amount
    PursePanel changePanel;  // a panel to display the change

    public RegisterPanel() {
        register = new Register();
        inputPanel = new JPanel();
        input = new JTextField();
        changePanel = new PursePanel();
        this.setPreferredSize(new Dimension(500, 500));
    }


    class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }  // a listener for changes to the input
}