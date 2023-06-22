import javax.swing.*;
import java.util.Collection;
import java.util.List;

class DisplayList extends Thread {
    private Runnable updateList;
    private Collection list;

    DisplayList(List l) {
        updateList = new Runnable() {
            public void run() {
                //Modifie la liste en
                //utilisant list
            }
        };
    }


    public void run() {
        // Remplit donneesListe avec les données
        // lues dans la base de données
        SwingUtilities.invokeLater(updateList);
    }
}