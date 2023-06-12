package com.picard.fullProject.gui;


import com.picard.fullProject.gui.listener.ListListener;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        super("Une fenêtre");
        setBounds(0, 0, 600, 200);

        Container c = this.getContentPane();
        JList list = new JList(new String[]{"One", "Two", "Three", "Four"});
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
