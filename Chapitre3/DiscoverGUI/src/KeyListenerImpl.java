import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerImpl extends KeyAdapter {
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'q')
            cancel();
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
            doWhenEsc();
    }

    private void doWhenEsc() {
    }

    private void cancel() {
    }
}
