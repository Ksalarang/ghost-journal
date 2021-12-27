package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Oni extends Ghost {
    public Oni() {
        super("Они", Evidence.EMF_READER, Evidence.SPIRIT_BOX, Evidence.GHOST_WRITING);
        strengths = "Более активен и агрессивен, когда игроки находятся в группе. Может с силой швырять предметы.";
        weaknesses = "Бросаемые им предметы не влияют на расудок игрока (в отличие от Демона).";
    }

    @Override
    public String getTypeWithEnding() { return getType(); }
}
