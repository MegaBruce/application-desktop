import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EcouteCaracteres extends KeyAdapter {
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'q')
            quitter();
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
            actionQuandEsc();
    }

    private void actionQuandEsc() {
    }

    private void quitter() {
    }
}
