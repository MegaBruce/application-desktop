import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre() {
        super("Une fenêtre");
        setBounds(0, 0, 400, 200);
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

        /*
        // Border Layout
        JButton bn = new JButton("North");
        JButton bs = new JButton("South");
        JButton bw = new JButton("West");
        JButton be = new JButton("East");
        JButton bc = new JButton("Center");
        cp.add(bn, BorderLayout.NORTH);
        cp.add(bs, BorderLayout.SOUTH);
        cp.add(bw, BorderLayout.WEST);
        cp.add(be, BorderLayout.EAST);
        cp.add(bc, BorderLayout.CENTER);
         */

        JPanel panel = new JPanel();
        JButton bouton = new JButton("Sauvegarder");
        JButton bouton2 = new JButton("Quitter");
        JTextField zoneSaisie = new JTextField(20);
        /*
        // Flow Layout
        // Si on ne veut pas centrer : panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        // On pourrait aussi ajouter des espaces entre les composants avec
        // panel.setLayout(new FlowLayout(FlowLayout.LEFT,5,8));

         */

        /*
        //Grid Layout
        // 2 lignes, n colonnes
        //panel.setLayout(new GridLayout(2,0));
        panel.add(zoneSaisie);
        panel.add(bouton);
        panel.add(bouton2);

         */


        // Box Layout

        JPanel a = new JPanel();
        JPanel b = new JPanel();
        JPanel c = new JPanel();
        a.setBackground( Color.RED);
        b.setBackground( Color.GREEN);
        c.setBackground( Color.BLUE);
        a.setMaximumSize( new Dimension(  10, 10) );
        b.setMaximumSize( new Dimension(  50, 10) );
        // Le plus simple est d'utiliser une Box :
        // Box b = Box.createVerticalBox();
        // mais on peut aussi mettre un BoxLayout pour gérer un autre container
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        a.setAlignmentX(Component.LEFT_ALIGNMENT);
        b.setAlignmentX(Component.LEFT_ALIGNMENT);
        c.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(a);
        // On peut ajouter des zones invisibles entre les composants :
        // panel.add(Box.createVerticalStrut(5));
        // ou
        // panel.add(Box.createRigidArea(new Dimension(5, 15)));
        // ou
        // panel.add(Box.createVerticalGlue());
        // ou
        // panel.add(new Box.Filler(
            // new Dimension(5,100),
            // new Dimension(5,100),
            // new Dimension(Short.MAX_VALUE,100))
        // );
        panel.add(b);
        panel.add(c);



        /*
        // Grid Bag Layout
        panel.setLayout(new GridBagLayout());
        GridBagConstraints contraintesB = new GridBagConstraints();
        GridBagConstraints contraintesB2 = new GridBagConstraints();
        GridBagConstraints contraintesT = new GridBagConstraints();
        // ligne et colonne du haut gauche
        contraintesT.gridx = 0;
        contraintesT.gridy = 0;
        // taille en lignes et colonnes (occupe 2 lignes ici)
        contraintesT.gridheight = 1;
        contraintesT.gridwidth = 2;
        contraintesT.insets.bottom = 10;
        contraintesT.anchor = GridBagConstraints.WEST;

        // Chaque élément peut avoir ses propres contraintes
        panel.add(zoneSaisie, contraintesT);

        contraintesB.gridx = 0;
        contraintesB.gridy = 1;
        contraintesB.ipadx = 40;
        contraintesB.fill = GridBagConstraints.HORIZONTAL;
        panel.add(bouton, contraintesB);

        contraintesB2.gridx = 1;
        contraintesB2.gridy = 1;
        contraintesB2.ipadx = 40;
        contraintesB2.fill = GridBagConstraints.HORIZONTAL;
        panel.add(bouton2, contraintesB2);

         */

        cp.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Fenetre();
    }
}
