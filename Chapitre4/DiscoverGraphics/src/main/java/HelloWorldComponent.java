import javax.swing.*;
import java.awt.*;

public class HelloWorldComponent extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello world!",0,100);
    }
}
