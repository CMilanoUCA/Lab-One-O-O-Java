public class RegisterPanel {
    Register register; // a register object to run the logic
    JPanel inputPanel;  // a panel to hold the JTextField for the user to enter an amount
    JTextField input;   // a place for the user to enter the amount
    PursePanel changePanel;  // a panel to display the change
    InputListener (class, implements ActionListener)   // a listener for changes to the input
    void actionPerformed(ActionEvent e);  // what happens when input changes
}
