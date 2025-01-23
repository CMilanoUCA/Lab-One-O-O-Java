import javax.swing.*;
import java.awt.*;

public class PursePanel extends javax.swing.JPanel {
    Purse purse;                      // represents the amount to display—initialize to empty Purse
    public void setPurse(Purse p) {
        purse = p;
        this.revalidate();
        this.repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Denomination den: purse.cash.keySet()) {
            for (int i = 0; i < purse.cash.get(den); i++) {
                ImageIcon icon = new ImageIcon(den.img);
                JLabel label = new JLabel(icon);
                this.add(label);
            }
        }

    }  // holds the logic for displaying purse contents

}
