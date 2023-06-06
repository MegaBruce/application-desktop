import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreSimple extends JFrame implements ActionListener {
    private JButton b1 = new JButton("…"),
            b2 = new JButton("…");
    private JTextField f = new JTextField(10);
    public FenetreSimple() {
        // ajout des composants dans la fenêtre
        // Fenetre écoute les composants
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == b1) {
            // action liée au bouton « b1 »
        }
        else if (source == b2) {
            // action liée au bouton « b2 »
        }
        else if (source == f) {
            // action liée au JTextField f
        }

        // Variante
        //Quand les composants à écouter sont très
        //nombreux, on peut regrouper dans le code
        //les traitements par types de composants

        String classeSource = source.getClass().getName();
        if (classeSource.equals("JButton")) {
            if (source == b1) {
                // action liée au bouton « b1 »
            }
            else if (source == b2) {
                // action liée au bouton « b2 »
            }
        }
        else if (classeSource.equals("JTextField")) {
            // action liée au JTextField f
        }
    }
}
