package com.diyar.programs.ghostJournal;

import com.diyar.programs.ghosts.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

class DescriptionPanel extends JPanel {
    private JLabel descriptionLabel = new JLabel("Описание");

    private JLabel strengthsLabel = new JLabel("Силы");
    private JLabel weaknessesLabel = new JLabel("Слабости");
    private JLabel featuresLabel = new JLabel("Особенности");

    private JTextArea strengths = new JTextArea();
    private JTextArea weaknesses = new JTextArea();
    private JTextArea features = new JTextArea();

    DescriptionPanel() {
        setLayout(new GridLayout(8, 1));
        setPreferredSize(new Dimension(700, 650));
        initGUI();
    }

    private void initGUI() {
        Utils.setFontSize(descriptionLabel, 27);
        Utils.setFontSize(strengthsLabel, 22);
        Utils.setFontSize(weaknessesLabel, 22);
        Utils.setFontSize(featuresLabel, 22);

        Utils.setFontSize(strengths, 20);
        Utils.setFontSize(weaknesses, 20);
        Utils.setFontSize(features, 20);

        strengths.setEditable(false);
        weaknesses.setEditable(false);
        features.setEditable(false);

        strengths.setFocusable(false);
        weaknesses.setFocusable(false);
        features.setFocusable(false);

        strengths.setLineWrap(true);
        weaknesses.setLineWrap(true);
        features.setLineWrap(true);

        strengths.setWrapStyleWord(true);
        weaknesses.setWrapStyleWord(true);
        features.setWrapStyleWord(true);

        LineBorder lineBorder = new LineBorder(new Color(55, 60, 65));
        strengths.setBorder(lineBorder);
        weaknesses.setBorder(lineBorder);
        features.setBorder(lineBorder);

        add(descriptionLabel);
        add(strengthsLabel);
        add(strengths);
        add(weaknessesLabel);
        add(weaknesses);
        add(featuresLabel);
        add(features);
    }

    void setDescriptionOf(Ghost ghost) {
        descriptionLabel.setText("Описание " + ghost.getTypeWithEnding());
        strengths.setText(ghost.getStrengths());
        weaknesses.setText(ghost.getWeaknesses());
        features.setText(ghost.getFeatures());
    }
}