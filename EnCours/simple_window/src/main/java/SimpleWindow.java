
import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {
        public SimpleWindow(){
            super("A window");

            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension dimensionScreen = tk.getScreenSize();

            int x = (int) Math.round(dimensionScreen.getWidth()/2);
            int windowHeight = (int) Math.round(dimensionScreen.getHeight()/2);

            setBounds(x,0, 600, windowHeight);

            setVisible(true);
        }

        public static void main(String[] args) {

            JFrame window = new SimpleWindow();
        }
}


