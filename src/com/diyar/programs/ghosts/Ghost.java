package com.diyar.programs.ghosts;

import com.diyar.programs.ghostJournal.Evidence;

public abstract class Ghost {
    private String type;
    private Evidence[] evidenceArray = new Evidence[3];
    String strengths = "У этого призрака нет сильных сторон.";
    String weaknesses = "У этого призрака нет слабых сторон.";
    String features = "У этого призрака нет особенностей.";

    Ghost(String type, Evidence evidence1, Evidence evidence2, Evidence evidence3) {
        this.type = type;
        evidenceArray[0] = evidence1;
        evidenceArray[1] = evidence2;
        evidenceArray[2] = evidence3;
    }

    public boolean has(String evidence) {
        for (Evidence ev : evidenceArray)
            if (ev.getRusName().equals(evidence)) return true;
        return false;
    }

    public Evidence getEvidence(int index) {
        if (index > -1 && index < 3) return evidenceArray[index];
        return null;
    }

    public String getType() { return type; }
    public String getTypeWithEnding() { return type + "а"; }

    public String getStrengths() { return strengths; }
    public String getWeaknesses() { return weaknesses; }
    public String getFeatures() { return features; }

    @Override
    public String toString() { return type; }
}
