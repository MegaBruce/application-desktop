import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame (){
        super();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        add(new HelloWorldComponent());
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
