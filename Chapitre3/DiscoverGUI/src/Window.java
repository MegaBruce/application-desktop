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

        Container cp = this.getContentPane();
        JLabel label = new JLabel("Bonjour");
        JButton b1 = new JButton("Cliquez moi !");
        cp.add(label, BorderLayout.NORTH);
        cp.add(b1, BorderLayout.SOUTH);

        JPanel a = new JPanel();
        JPanel b = new JPanel();
        JPanel c = new JPanel();

        a.setBackground( Color.RED );
        b.setBackground( Color.GREEN  );
        c.setBackground( Color.BLUE );

        a.setMaximumSize( new Dimension(  10, 10) );
        b.setMaximumSize( new Dimension(  50, 10) );

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(a);
        panel.add(b);
        panel.add(c);

        cp.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Window();
    }
}
