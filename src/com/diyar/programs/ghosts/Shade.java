package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Shade extends Ghost {
    public Shade() {
        super("Тень", Evidence.EMF_READER, Evidence.GHOST_WRITING, Evidence.GHOST_ORB);
        strengths = "Предпочитает атаковать одиноких игроков.";
        weaknesses = "Не нападает, если игроки держатся в группе.";
    }

    @Override
    public String getTypeWithEnding() { return getType().substring(0, getType().length() - 1) + "и"; }
}
