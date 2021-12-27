package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Wraith extends Ghost {
    public Wraith() {
        super("Мираж", Evidence.SPIRIT_BOX, Evidence.FINGERPRINTS, Evidence.FREEZING_TEMPERATURES);
        strengths = "Может ходить и видеть сквозь двери и стены. Не касается земли, а значит не оставляет на ней следов.";
        weaknesses = "Прекратит атаку, если наступит на соль.";
        features = "Может телепортироваться в пределах 3-х метров от случайного игрока, создавая всплески ЭМП.";
    }
}
