package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Spirit extends Ghost {
    public Spirit() {
        super("Дух", Evidence.SPIRIT_BOX, Evidence.FINGERPRINTS, Evidence.GHOST_WRITING);
        weaknesses = "Использование благовоний остановит нападения Духа на 120 секунд (а не 90).";
    }
}
