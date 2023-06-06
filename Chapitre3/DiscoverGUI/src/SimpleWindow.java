import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class SimpleWindow extends JFrame implements ActionListener {
    private JButton saveButton = new JButton("Save"),
            cancelButton = new JButton("Cancel");
    private JTextField testArea = new JTextField(10);
    public SimpleWindow() {
        // ajout des composants dans la fenêtre
        // Window écoute les composants
        saveButton.addActionListener(this);
        cancelButton.addActionListener(this);
        testArea.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == saveButton) {
            // action liée au bouton « b1 »
        }
        else if (source == cancelButton) {
            // action liée au bouton « b2 »
        }
        else if (source == testArea) {
            // action liée au JTextField f
        }

        // Variante
        //Quand les composants à écouter sont très
        //nombreux, on peut regrouper dans le code
        //les traitements par types de composants

        String classeSource = source.getClass().getName();
        if (classeSource.equals("JButton")) {
            if (source == saveButton) {
                // action liée au bouton « b1 »
            }
            else if (source == cancelButton) {
                // action liée au bouton « b2 »
            }
        }
        else if (classeSource.equals("JTextField")) {
            // action liée au JTextField f
        }

        // Génération d'un évènement
        // le code suivant simule la
        // fermeture de la fenêtre par l’utilisateur (et
        // sans doute la sortie de l’application)
        if (e.getActionCommand().equals("sortie")) {
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
}
