package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Mare extends Ghost {
    public Mare() {
        super("Мара", Evidence.SPIRIT_BOX, Evidence.GHOST_ORB, Evidence.FREEZING_TEMPERATURES);
        strengths = "Увеличенный шанс атаки в темноте. Выключает свет и щиток чаще других призраков.";
        weaknesses = "Включение света в месте её обитания снижает шанс атаки.";
        features = "Способна начать новую охоту почти сразу после того, как закончится предыдущая.";
    }

    @Override
    public String getTypeWithEnding() { return getType().substring(0, getType().length() - 1) + "ы"; }
}
