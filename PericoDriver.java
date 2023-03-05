package org.example;

import java.awt.*;

public class PericoDriver {

    public static void main(String[] args) {

        Perico manuel = new Perico("Manuel",Color.BLUE,2,"Amigable",false);

        System.out.println(manuel.hablar());
        System.out.println(manuel.dormir());
        System.out.println(manuel.volar());
        System.out.println(manuel);

    }
}
