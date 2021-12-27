package com.diyar.programs.ghostJournal;

import com.diyar.programs.ghosts.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class EvidencePanel extends JPanel {
    final String SGE_BUTTON_TITLE = "Показать улики"; //show ghost evidence button title
    private final String GHOST_TYPE_TITLE = "Типы призраков (";

    private final JLabel evidenceLabel = new JLabel("Улики", JLabel.CENTER);
    private final JLabel emptyLabel = new JLabel();
    private JLabel ghostTypeLabel = new JLabel(GHOST_TYPE_TITLE, JLabel.CENTER);

    private final JComboBox<String>
            evidenceComboBox1 = new JComboBox<>(Evidence.getRusNames()),
            evidenceComboBox2 = new JComboBox<>(Evidence.getRusNames()),
            evidenceComboBox3 = new JComboBox<>(Evidence.getRusNames());

    final JButton showGhostEvidenceButton = new JButton(SGE_BUTTON_TITLE);
    JComboBox<Ghost> ghostComboBox;

    private final Ghost[] ghosts = new Ghost[13];
    private String[] selectedEvidence = new String[3];
    private ArrayList<Ghost> remainingGhosts = new ArrayList<>();

    EvidencePanel() {
        setLayout(new GridLayout(8, 1, 0, 10));
        setPreferredSize(new Dimension(300, 650));

        createGhosts();
        ghostComboBox = new JComboBox<>(ghosts);
        ghostTypeLabel.setText(GHOST_TYPE_TITLE + (ghostComboBox.getItemCount() - 1) + ")");
        Arrays.fill(selectedEvidence, Evidence.NO_DATA.getRusName());

        initGUI();

        //add action listeners to combo boxes
        evidenceComboBox1.addActionListener(e -> {
            selectedEvidence[0] = (String) evidenceComboBox1.getSelectedItem();
            findGhosts();
        });
        evidenceComboBox2.addActionListener(e -> {
            selectedEvidence[1] = (String) evidenceComboBox2.getSelectedItem();
            findGhosts();
        });
        evidenceComboBox3.addActionListener(e -> {
            selectedEvidence[2] = (String) evidenceComboBox3.getSelectedItem();
            findGhosts();
        });

        showGhostEvidenceButton.addActionListener(e -> {
            Ghost ghost = (Ghost) ghostComboBox.getSelectedItem();
            int itemCount = evidenceComboBox1.getItemCount();

            for (int i = 0; i < itemCount; i++) {
                if (evidenceComboBox1.getItemAt(i).equals(ghost.getEvidence(0).getRusName()))
                    evidenceComboBox1.setSelectedItem(evidenceComboBox1.getItemAt(i));

                if (evidenceComboBox2.getItemAt(i).equals(ghost.getEvidence(1).getRusName()))
                    evidenceComboBox2.setSelectedItem(evidenceComboBox2.getItemAt(i));

                if (evidenceComboBox3.getItemAt(i).equals(ghost.getEvidence(2).getRusName()))
                    evidenceComboBox3.setSelectedItem(evidenceComboBox3.getItemAt(i));
            }
            ghostComboBox.setSelectedItem(ghost);
        });
    }

    private void createGhosts() {
        ghosts[0] = new GhostUnselected();
        ghosts[1] = new Spirit();
        ghosts[2] = new Wraith();
        ghosts[3] = new Phantom();
        ghosts[4] = new Poltergeist();
        ghosts[5] = new Banshee();
        ghosts[6] = new Jinn();
        ghosts[7] = new Mare();
        ghosts[8] = new Revenant();
        ghosts[9] = new Shade();
        ghosts[10] = new Demon();
        ghosts[11] = new Yurei();
        ghosts[12] = new Oni();
    }

    private void initGUI() {
        Utils.setFontSize(evidenceLabel, 27);
        Utils.setFontSize(ghostTypeLabel, 25);
        Utils.setFontSize(showGhostEvidenceButton, 17);
        Utils.setFontSize(emptyLabel, 20);

        Utils.setFontSize(evidenceComboBox1, 22);
        Utils.setFontSize(evidenceComboBox2, 22);
        Utils.setFontSize(evidenceComboBox3, 22);
        Utils.setFontSize(ghostComboBox, 22);

        //center horizontally all combo boxes
        DefaultListCellRenderer cellRenderer = new DefaultListCellRenderer();
        cellRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        evidenceComboBox1.setRenderer(cellRenderer);
        evidenceComboBox2.setRenderer(cellRenderer);
        evidenceComboBox3.setRenderer(cellRenderer);
        ghostComboBox.setRenderer(cellRenderer);

        add(evidenceLabel);
        add(evidenceComboBox1);
        add(evidenceComboBox2);
        add(evidenceComboBox3);
        add(emptyLabel);
        add(ghostTypeLabel);
        add(ghostComboBox);
        add(showGhostEvidenceButton);
    }

    private void findGhosts() {
        remainingGhosts.clear();
        remainingGhosts.addAll(Arrays.asList(ghosts));

        for (String evidence : selectedEvidence) {
            if (evidence.equals(Evidence.NO_DATA.getRusName())) continue;
            Iterator iterator = remainingGhosts.iterator();
            while (iterator.hasNext()) {
                Ghost nextGhost = (Ghost) iterator.next();
                if (!nextGhost.has(evidence) && !(nextGhost instanceof GhostUnselected)) iterator.remove();
            }
        }
        ghostComboBox.setModel(new DefaultComboBoxModel<>(remainingGhosts.toArray(new Ghost[0])));
        if (ghostComboBox.getItemCount() == 1) ghostComboBox.setSelectedItem(remainingGhosts.get(0));
        else ghostComboBox.setSelectedItem(remainingGhosts.get(1));
        ghostTypeLabel.setText(GHOST_TYPE_TITLE + (ghostComboBox.getItemCount() - 1) + ")");
    }
}