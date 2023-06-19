package com.picard.fullProject.gui;


import com.picard.fullProject.gui.listener.ListListener;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        super("Une fenêtre");
        setBounds(0, 0, 600, 200);

        Container c = this.getContentPane();
        DefaultListModel pays = new DefaultListModel();
        pays.addElement("France");
        pays.addElement("Italie");
        pays.addElement("Espagne");
        pays.addElement("Maroc");

        JList list = new JList(pays);
        JScrollPane sList = new JScrollPane(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ListListener listListener = new ListListener();
        list.addListSelectionListener(listListener);
        // Ajoute le scrollPane dans le container,
        // ce qui ajoutera la liste
        c.add(sList);

        setVisible(true);
    }
}
