import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageComponent extends JPanel {
    public void paintComponent(Graphics g) {
        URL url = getClass().getResource("/img/image.gif");
        Image image = getToolkit().getImage(url);
        //g.drawImage(image, 0, 0, this);

        Component comp = this;
        // L’image sera tracée dans le composant comp
        MediaTracker md = new MediaTracker(comp);
        md.addImage(image, 0);
        try {
            md.waitForID(0); // ou waitForAll()
        }
        catch(InterruptedException e) {}
        if (!md.isErrorID(0)) {
            g.drawImage(image, 375, 0, this);
        }

    }
}
