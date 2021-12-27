package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Banshee extends Ghost {
    public Banshee() {
        super("Банши", Evidence.EMF_READER, Evidence.FINGERPRINTS, Evidence.FREEZING_TEMPERATURES);
        strengths = "Преследует одного игрока, пока не убьёт его.";
        weaknesses = "Боится распятий (радиус действия 5 метров, а не 3).";
        features = "Игнорирует уровень рассудка и обычные правила охоты, т. е. на среднем уровне и выше она может начать охоту сразу же.";
    }

    @Override
    public String getTypeWithEnding() { return getType(); }
}
