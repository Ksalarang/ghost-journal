package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Yurei extends Ghost {
    public Yurei() {
        super("Юрей", Evidence.GHOST_WRITING, Evidence.GHOST_ORB, Evidence.FREEZING_TEMPERATURES);
        strengths = "Очень сильно воздействует на рассудок игрока.";
    }

    @Override
    public String getTypeWithEnding() { return getType(); }
}
