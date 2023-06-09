import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JButton saveButton, cancelButton;

    public Window() {
        ActionListener buttonListener = new ButtonListener();
        saveButton.addActionListener(buttonListener);
        saveButton.setActionCommand("Save");
        cancelButton.addActionListener(buttonListener);
        cancelButton.setActionCommand("Cancel");
    }
    class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String commande = e.getActionCommand();
            if (commande.equals("Save")) {
                // action liée au bouton save
            }
            else if (commande.equals("Cancel")) {
                // action liée au bouton cancel
            }
        }
    }
}