import javax.swing.*;
import java.net.URL;

public class ImageIconJLabel extends JFrame {
    public ImageIconJLabel (){
        super();
        setVisible(true);
        setSize(200, 200);
        URL url =getClass().getResource("/img/image.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        add(label);
    }

    public static void main(String[] args) {
        ImageIconJLabel imageIconJLabel = new ImageIconJLabel();
    }
}
