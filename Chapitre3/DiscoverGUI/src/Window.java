import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        super("A window");
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
        tk.beep();

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame window = new Window();
    }
}
