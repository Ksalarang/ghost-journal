package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Demon extends Ghost {
    public Demon() {
        super("Демон", Evidence.SPIRIT_BOX, Evidence.GHOST_WRITING, Evidence.FREEZING_TEMPERATURES);
        strengths = "Атакует чаще других призраков.";
        weaknesses = "Получение успешных ответов от Демона с помощью доски Уиджи не снижает уровень рассудка.";
        features = "В его самой агрессивной фазе интервалы между атаками длятся всего 30 секунд.";
    }
}
