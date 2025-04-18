import javax.swing.*;
import java.awt.*;

public class PursePanel extends javax.swing.JPanel {
    private Register register;
    Purse purse; // represents the amount to display—initialize to empty Purse

    public void setPurse(Purse p) {
        purse = p;
    }

    public PursePanel(Register register) {
        this.register = register;
    }

public void draw(Purse p) {
    removeAll();
    setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));  // Horizontal layout w/10px gaps

    // Add Strategy Info
    String algoUsed = register.getStrategyName();
    JLabel algoLabel = new JLabel("Algorithm used: " + algoUsed);
    algoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
    add(algoLabel);

    purse = p;
    if (purse.getValue() <= 0) {
        add(new JLabel("No change needed"));
        return;
    }

    for (Denomination den : purse.cash.keySet()) {
        int count = purse.cash.get(den);
        if (count > 0) {
            // Create Panel for Each Denomination Type
            JPanel denomPanel = new JPanel();
            denomPanel.setLayout(new BoxLayout(denomPanel, BoxLayout.Y_AXIS));

            // Add Image
            ImageIcon icon = new ImageIcon(den.img);
            JLabel imageLabel = new JLabel(icon);
            denomPanel.add(imageLabel);

            // Add Denomination Count Label
            JLabel countLabel = new JLabel(count + "×", SwingConstants.CENTER);
            denomPanel.add(countLabel);

            add(denomPanel);
        }
    }
    revalidate();
    repaint();
}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }  // Java-built paintComponent [DO NOT CHANGE!]
}