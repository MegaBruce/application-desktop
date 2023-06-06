import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        super("Une fenêtre");
        setBounds(0,0, 300, 200);
        /* OU :
        setLocation(); setSize()
         */

        /* Annule les fonction supérieure pour compacter la fenêtre
        pack();
         */

        // Centre une fenetre
        setLocationRelativeTo(null);

        //Toolkit tk = Toolkit.getDefaultToolkit();
        /* Méthodes utiles : getScreenSize, getScreenResolution,
        getDefaultToolkit, beep, getImage,
        createImage, getSystemEventQueue
        */
        // tk.beep();

        //On créé le container (ou JPannel)
        Container cp = this.getContentPane();

        //On créé les composants légers
        JLabel label = new JLabel("Bonjour");
        JButton b1 = new JButton("Cliquez moi !");

        //On ajoute les composants légers au container
        cp.add(label, BorderLayout.NORTH);
        cp.add(b1, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Window();
    }
}
