package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class GhostUnselected extends Ghost {
    public GhostUnselected() {
        super("Неизвестно", Evidence.NO_DATA, Evidence.NO_DATA, Evidence.NO_DATA);
        strengths = "";
        weaknesses = "";
        features = "";
    }

    @Override
    public String getTypeWithEnding() { return ""; }
}
