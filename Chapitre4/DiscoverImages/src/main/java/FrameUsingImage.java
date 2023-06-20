import javax.swing.*;

public class FrameUsingImage extends JFrame {

    public FrameUsingImage (){
        super();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        add(new ImageComponent());
    }

    public static void main(String[] args) {
        FrameUsingImage frame = new FrameUsingImage();
    }
}
