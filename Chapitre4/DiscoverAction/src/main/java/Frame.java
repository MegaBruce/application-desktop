

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Frame extends JFrame {
    private static final Logger logger = LoggerFactory.getLogger(Frame.class);
        public Frame (){
            super();
            setSize(200, 200);
            setVisible(true);
            URL url =getClass().getResource("/img/previous.png");
            Icon icon = new ImageIcon(url);
            AbstractAction actionPrevious = new AbstractAction("Question précédente", icon) {
                @Override
                public void actionPerformed(ActionEvent e) {
                    logger.info("go to previous");
                }
            };

            JButton bPrevious = new JButton(actionPrevious);
            add(bPrevious);
            bPrevious.setText("Précédent"); // bouton "image" avec tooltip
        }

        public static void main(String[] args) {
            Frame frame = new Frame();
        }

}
