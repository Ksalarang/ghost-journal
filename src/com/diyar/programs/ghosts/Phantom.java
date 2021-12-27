package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Phantom extends Ghost {
    public Phantom() {
        super("Фантом",  Evidence.EMF_READER, Evidence.GHOST_ORB, Evidence.FREEZING_TEMPERATURES);
        strengths = "Если игрок будет долго смотреть на Фантома, это сильно снизит его рассудок.";
        weaknesses = "Если сфотографировать Фантома, он исчезнет на некоторое время. Это не сработает во время охоты.";
        features = "При появлении может принять облик одного из игроков, в том числе самого наблюдателя.";
    }
}
