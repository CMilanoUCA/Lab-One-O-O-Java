import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends javax.swing.JPanel {
    // Add dropdown changing currency of register

    Register register; // a register object to run the logic
    JPanel inputPanel;  // a panel to hold the JTextField for the user to enter an amount
    JTextField input;   // a place for the user to enter the amount
    PursePanel changePanel;  // a panel to display the change

    public RegisterPanel() {
        register = new Register();
        inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(480, 50));
        input = new JTextField();
        input.setPreferredSize(new Dimension(200, 30));
        input.addActionListener(new InputListener());
        inputPanel.add(input);
        changePanel = new PursePanel();
        changePanel.setPreferredSize(new Dimension(950, 850));
        this.setPreferredSize(new Dimension(1000, 900));
        this.add(inputPanel);
        this.add(changePanel);
    }

    class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        double amount = Double.parseDouble(input.getText());
        Purse purse = register.makeChange(amount);
        changePanel.draw(purse);
        changePanel.revalidate();
        changePanel.repaint();
        }
    }  // a listener for changes to the input
}