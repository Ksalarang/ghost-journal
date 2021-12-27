package com.diyar.programs.ghostJournal;

public enum Evidence {
    NO_DATA("Нет данных"),
    EMF_READER("Датчик ЭМП (ур. 5)"),
    SPIRIT_BOX("Радиоприёмник"),
    GHOST_WRITING("Записи в тетради"),
    FINGERPRINTS("Отпечатки"),
    GHOST_ORB("Призрачный огонёк"),
    FREEZING_TEMPERATURES("Минусовая температура");

    private String rusName;
    private static String[] rusNames = new String[values().length];

    static {
        for (int i = 0; i < rusNames.length; i++)
            rusNames[i] = values()[i].rusName;
    }

    Evidence(String rusName) { this.rusName = rusName; }

    public String getRusName() { return rusName; }

    public static String[] getRusNames() {
        return rusNames;
    }
}
