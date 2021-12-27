package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public class Jinn extends Ghost {
    public Jinn() {
        super("Джинн", Evidence.EMF_READER, Evidence.SPIRIT_BOX, Evidence.GHOST_ORB);
        strengths = "Чем дальше жертва находится от Джинна во время охоты, тем быстрее он двигается.";
        weaknesses = "Не может использовать свои способности, если выключить электричество.";
        features = "Взамодействует с электроникой чаще, чем другие (телефон, радио, телевизор, автосигнализация).";
    }
}
