import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private JButton b1, b2;

    public Fenetre() {
        ActionListener eb = new EcouteurBouton();
        b1.addActionListener(eb);
        b1.setActionCommand("b1");
        b2.addActionListener(eb);
        b2.setActionCommand("b2");
    }
    class EcouteurBouton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            String commande = e.getActionCommand();
            if (commande.equals("b1")) {
                // action liée au bouton b1
            }
            else if (commande.equals("b2")) {
                // action liée au bouton b2
            }
        }
    }
}