import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class EcouteurBouton extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        ((JButton)e.getSource()).setText("Appuyé");
        // Tester si la touche Ctrl était appuyée :
        boolean b = (e.getModifiers() & InputEvent.CTRL_MASK) != 0;
        // ou
        b = e.isControlDown();
        // Tester si l’une des touches Ctrl ou Shift était appuyée :
        b = (e.getModifiers() & (InputEvent.SHIFT_MASK | InputEvent.CTRL_MASK)) != 0;
        //Tester si les 2 touches Ctrl ou Shift étaient
        //appuyées, mais pas la touche Meta (il faudrait
        //beaucoup de doigts !) :
        int on = InputEvent.SHIFT_MASK | InputEvent.CTRL_MASK;
        int off = InputEvent.META_MASK;
        boolean result = (e.getModifiers() & (on | off)) == on;
    }
    public void mouseClicked(MouseEvent e) {
        ((JButton)e.getSource()).
                setText(e.getClickCount() + "clics");
    }
}
