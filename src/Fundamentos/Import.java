package Fundamentos;

import javax.swing.*;
import java.util.Date;

public class Import {
    public static void main(String[] args) {
        String s = "Bom dia";
        System.out.println(s);

        Date d = new Date(); // Alt + Enter = import java.util.Date
        System.out.println(d);

        JButton botao = new JButton();

        //caminho completo dos imports Strings e System
        java.lang.String b = "Boa tarde";
        java.lang.System.out.println(b);

        //Ctrl + Shift + O
        //Organiza os imports (inclui, exclui e orrganiza)

    }
}
