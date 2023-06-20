import javax.swing.*;
import java.awt.*;

public class ColorAndFontComponent extends JPanel {
    public void paintComponent(Graphics g) {
        g.setClip(0, 30, 500, 500);
        super.paintComponent(g);
        Font f = new Font("SansSerif", Font.BOLD, 14);
        Font fi = new Font("SansSerif",
                Font.BOLD + Font.ITALIC, 14);
        g.setFont(f);
        g.setColor(Color.red);
        setBackground(Color.blue); // couleur de fond
        g.drawString("Hello world!", 75, 100);
        // g.drawImage(image, 100, 75, null);
        g.setFont(fi);
        g.drawString("Hello world!", 75, 200);

        // Centrer un message
        String msg = "Je suis un message destiné à être centré";
        int largeur = g.getClipBounds().width;
        int hauteur = g.getClipBounds().height;
        FontMetrics fm = getFontMetrics(getFont());
        int hauteurTexte = fm.getHeight();
        int largeurTexte = fm.stringWidth(msg);
        g.drawString( msg, ((largeur - largeurTexte) / 2), ((hauteur - hauteurTexte) / 2));

        this.dessine(g);
    }

    public void dessine(Graphics g) {
        Rectangle r = g.getClipBounds();
        g.drawLine(0, 0, r.width, r.height);
    }
}
