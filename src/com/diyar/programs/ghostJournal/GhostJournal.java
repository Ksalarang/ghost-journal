package com.diyar.programs.ghostJournal;

import com.diyar.programs.ghosts.*;

import javax.swing.*;
import java.awt.*;

public class GhostJournal extends JFrame {
    private EvidencePanel evidencePanel = new EvidencePanel();
    private DescriptionPanel descriptionPanel = new DescriptionPanel();

    private GhostJournal() {
        super("Ghost Journal");
        setLayout(new BorderLayout());
        setBounds(400, 100, 1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(evidencePanel, BorderLayout.WEST);
        getContentPane().add(descriptionPanel, BorderLayout.CENTER);

        evidencePanel.ghostComboBox.addActionListener(e -> {
            Ghost ghost = (Ghost) evidencePanel.ghostComboBox.getSelectedItem();
            descriptionPanel.setDescriptionOf(ghost);
            evidencePanel.showGhostEvidenceButton.
                    setText(evidencePanel.SGE_BUTTON_TITLE + " " + ghost.getTypeWithEnding());
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args)
    throws Exception {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            if ("Nimbus".equals(info.getName())) {
                initLookAndFeel();
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }

        new GhostJournal();
    }

    private static void initLookAndFeel() {
        Color background = new Color(55, 60, 65);
        Color foreground = new Color(200, 200, 200);
        Color comboBoxBackground = new Color(25, 30, 35);

        UIManager.put("control", background);
        UIManager.put("TextArea.background", background);
        UIManager.put("text", foreground);

        UIManager.put("ComboBox.background", comboBoxBackground);
        UIManager.put("Button.background", background);
    }
}