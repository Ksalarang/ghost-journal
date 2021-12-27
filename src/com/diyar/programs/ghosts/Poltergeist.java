package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Poltergeist extends Ghost {
    public Poltergeist() {
        super("Полтергейст", Evidence.SPIRIT_BOX, Evidence.FINGERPRINTS, Evidence.GHOST_ORB);
        strengths = "Способен единовременно манипулировать большим количеством предметов.";
        weaknesses = "Почти беспомощен в пустой комнате. Единственный, кого можно определить при помощи только 2-х улик - отпечатков и призрачного огонька.";
        features = "Может одновременно закрыть несколько дверей.";
    }
}
