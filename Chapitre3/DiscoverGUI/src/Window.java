import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        super("Une fenêtre");
        setBounds(0, 0, 600, 200);
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




        /*
        // Flow Layout
        JPanel panel = new JPanel();
        JButton saveButton = new JButton("Sauvegarder");
        JButton cancelButton = new JButton("Quitter");
        JTextField textArea = new JTextField(20);

        // Si on ne veut pas centrer :
        // panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        // On pourrait aussi ajouter des espaces entre les composants avec
        // panel.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

        panel.add(textArea);
        panel.add(saveButton);
        panel.add(cancelButton);

        cp.add(panel);

         */



        /*
        //Grid Layout
        JPanel panel = new JPanel();
        JButton saveButton = new JButton("Sauvegarder");
        JButton cancelButton = new JButton("Quitter");
        JTextField textArea = new JTextField(20);
        // 2 lignes, n colonnes
        panel.setLayout(new GridLayout(2,0));
        // n colonnes
        // panel.setLayout(new GridLayout(1,0));
        // n ligne
        // panel.setLayout(new GridLayout(0,1));

        panel.add(textArea);
        panel.add(saveButton);
        panel.add(cancelButton);

        cp.add(panel);

         */


        /*
        // Grid Bag Layout
        JPanel panel = new JPanel();
        JButton saveButton = new JButton("Sauvegarder");
        JButton cancelButton = new JButton("Quitter");
        JTextField textArea = new JTextField(40);
        JTextField shortTextArea = new JTextField();
        JTextField longTextArea = new JTextField();

        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraintsSaveButton = new GridBagConstraints();
        GridBagConstraints constraintsCancelButton = new GridBagConstraints();
        GridBagConstraints constraintsTextArea = new GridBagConstraints();
        GridBagConstraints constraintsShortTextArea = new GridBagConstraints();
        GridBagConstraints constraintsLongTextArea = new GridBagConstraints();

        // ligne et colonne du haut gauche
        constraintsTextArea.gridx = 0;
        constraintsTextArea.gridy = 0;
        // taille en lignes et colonnes (occupe 2 lignes ici)
        constraintsTextArea.gridheight = 1;
        constraintsTextArea.gridwidth = 4;
        constraintsTextArea.insets.bottom = 10;
        constraintsTextArea.fill = GridBagConstraints.HORIZONTAL;
        constraintsTextArea.anchor = GridBagConstraints.WEST;
        // Chaque élément peut avoir ses propres contraintes
        panel.add(textArea, constraintsTextArea);

        constraintsShortTextArea.gridx = 0;
        constraintsShortTextArea.gridy = 1;
        constraintsShortTextArea.gridwidth = 3;
        // constraintsShortTextArea.weightx = 1;
        constraintsShortTextArea.anchor = GridBagConstraints.WEST;
        constraintsShortTextArea.fill = GridBagConstraints.HORIZONTAL;
        panel.add(shortTextArea, constraintsShortTextArea);

        constraintsLongTextArea.gridx = 3;
        constraintsLongTextArea.gridy = 1;
        constraintsLongTextArea.gridwidth = 1;
        // constraintsLongTextArea.weightx = 2;
        constraintsLongTextArea.anchor = GridBagConstraints.WEST;
        constraintsLongTextArea.fill = GridBagConstraints.HORIZONTAL;
        panel.add(longTextArea, constraintsLongTextArea);

        constraintsSaveButton.gridx = 0;
        constraintsSaveButton.gridy = 2;
        constraintsSaveButton.ipadx = 40;
        constraintsSaveButton.gridwidth = 2;
        // constraintsSaveButton.weightx = 4;
        constraintsSaveButton.fill = GridBagConstraints.HORIZONTAL;
        panel.add(saveButton, constraintsSaveButton);

        constraintsCancelButton.gridx = 2;
        constraintsCancelButton.gridy = 2;
        constraintsCancelButton.ipadx = 40;
        constraintsCancelButton.gridwidth = 2;
        // constraintsCancelButton.weightx = 1;
        constraintsCancelButton.fill = GridBagConstraints.HORIZONTAL;
        panel.add(cancelButton, constraintsCancelButton);

        cp.add(panel);

         */



        /*
        // Box Layout
        JPanel panel = new JPanel();
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
        cp.add(panel);

         */


        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Window();
    }
}
