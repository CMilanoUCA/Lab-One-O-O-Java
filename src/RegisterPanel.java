import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterPanel extends JPanel {
    private Register register;
    private JComboBox<Currency.CurrencyType> currencyCombo;
    private JTextField amountField;
    private PursePanel changePanel;
    private JButton calculateButton;
    private JComboBox<String> strategyCombo;

    public RegisterPanel() {
        register = new Register(Currency.CurrencyType.US, new GreedyChangeStrategy()); // Defaults
        setupUI();
    }

    public void showGUI() {
        JFrame frame = new JFrame("Change Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));

        // Main Container
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add GUI Components
        mainPanel.add(createControlPanel(), BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(changePanel), BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center window
        frame.setVisible(true);
    }

    private JPanel createControlPanel() {
        JPanel controlPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Currency Selection Dropdown
        gbc.gridx = 0;
        gbc.gridy = 0;
        controlPanel.add(new JLabel("Currency:"), gbc);

        gbc.gridx = 1;
        currencyCombo = new JComboBox<>(Currency.CurrencyType.values());
        currencyCombo.setPreferredSize(new Dimension(200, 25));
        controlPanel.add(currencyCombo, gbc);

        // Amount Input
        gbc.gridx = 0;
        gbc.gridy = 1;
        controlPanel.add(new JLabel("Amount:"), gbc);

        gbc.gridx = 1;
        amountField = new JTextField(10);
        controlPanel.add(amountField, gbc);

        // Strategy Selection
        gbc.gridx = 0;
        gbc.gridy = 3;
        controlPanel.add(new JLabel("Algorithm:"), gbc);

        gbc.gridx = 1;
        strategyCombo = new JComboBox<>(new String[]{"Greedy", "Optimal"});
        controlPanel.add(strategyCombo, gbc);

        // Calculate Button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateListener());
        controlPanel.add(calculateButton, gbc);

        return controlPanel;
    }

    private void setupUI() {
        changePanel = new PursePanel(register);
        changePanel.setBackground(Color.WHITE);
        changePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                ChangeStrategy strategy = strategyCombo.getSelectedIndex() == 0
                        ? new GreedyChangeStrategy()
                        : new OptimalChangeStrategy();

                register.setStrategy(strategy);
                register = new Register((Currency.CurrencyType)currencyCombo.getSelectedItem(), strategy);
                Purse purse = register.makeChange(amount);

                changePanel.draw(purse);
                changePanel.revalidate();
                changePanel.repaint();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(RegisterPanel.this,
                        "Error: " + ex.getMessage(), "Calculation Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}