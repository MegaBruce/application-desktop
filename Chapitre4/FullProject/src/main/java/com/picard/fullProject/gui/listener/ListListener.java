package com.picard.fullProject.gui.listener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.*;
import java.io.StringWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListListener implements ListSelectionListener {
    private static final Logger logger = LoggerFactory.getLogger(ListListener.class);

    @Override
    public void valueChanged(ListSelectionEvent e) {
        StringWriter textArea = null;
        // On ignore les désélections
        if (e.getValueIsAdjusting()) return;
        // On traite les sélections
        JList source = (JList) e.getSource();
        // getSelectedValue() si un seul choix possible
        Object[] choice = source.getSelectedValues();
        for (int i = 0; i < choice.length; i++) {
            // Ajoute les choix dans une zone de texte
            logger.info("Choice : {}", choice[i]);
        }
    }
}
