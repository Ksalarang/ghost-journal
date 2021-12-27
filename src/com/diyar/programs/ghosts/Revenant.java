package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Revenant extends Ghost {
    public Revenant() {
        super("Ревенант", Evidence.EMF_READER, Evidence.FINGERPRINTS, Evidence.GHOST_WRITING);
        strengths = "Во время охоты перемещается с повышенной скоростью. Может свободно переключаться между жертвами.";
        weaknesses = "Спрятавшись от Ревенанта, игроки сильно замедляют его.";
    }
}
