package com.diyar.programs.ghostJournal;

import java.awt.*;

class Utils {
    static void setFontSize(Component component, int fontSize) {
        component.setFont(new Font(component.getFont().getFontName(), component.getFont().getStyle(), fontSize));
    }
}
