import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre (){
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

        Toolkit tk = Toolkit.getDefaultToolkit();
        /* Méthodes utiles : getScreenSize, getScreenResolution,
        getDefaultToolkit, beep, getImage,
        createImage, getSystemEventQueue
        */
        tk.beep();

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame fenetre = new Fenetre();
    }
}
