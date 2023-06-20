import javax.swing.*;
import java.awt.*;

public class DrawnComponent extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(10, 50, 100, 80);
        Color couleur = g.getColor();
        g.setColor(Color.green);
        g.fillRect(20, 60, 50, 40);
        g.drawOval(5, 40, 110, 110);
        g.setColor(couleur);
        g.drawPolygon(
                new int[] {200, 210, 250, 280, 200},
                new int[] {110, 120, 60, 200, 300},
                5);
    }
}
