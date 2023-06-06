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

        //Toolkit tk = Toolkit.getDefaultToolkit();
        /* Méthodes utiles : getScreenSize, getScreenResolution,
        getDefaultToolkit, beep, getImage,
        createImage, getSystemEventQueue
        */
        // tk.beep();

        Container cp = this.getContentPane();
        JLabel label = new JLabel("Bonjour");
        JButton b1 = new JButton("Cliquez moi !");
        cp.add(label, BorderLayout.NORTH);
        cp.add(b1, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Fenetre();
    }
}
