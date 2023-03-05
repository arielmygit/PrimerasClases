package org.example;

import java.awt.*;

public class Perico {
    private String nombre;
    private Color color;
    private int edad;
    private String caracter;
    private boolean cautiverio;

    public Perico() {
    }

    public Perico(String nombre, Color color, int edad, String caracter, boolean cautiverio) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.caracter = caracter;
        this.cautiverio = cautiverio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public boolean isCautiverio() {
        return cautiverio;
    }

    public void setCautiverio(boolean cautiverio) {
        this.cautiverio = cautiverio;
    }

    @Override
    public String toString() {
        return "Perico{" +
                "nombre='" + nombre + '\'' +
                ", color=" + color +
                ", edad=" + edad +
                ", caracter='" + caracter + '\'' +
                ", cautiverio=" + cautiverio +
                '}';
    }

    public boolean hablar(){
        boolean x = edad>2;
        System.out.println(nombre+" sabe hablar?");
        return x;
    }

    public double dormir(){
        double y = Math.random();
        double horas = y*1000;
        System.out.println(nombre+" ha dormido "+horas+" horas en su vida.");
        return horas;
    }

    public boolean volar(){
        if(cautiverio = true){
            System.out.println(nombre+" se crió en cautiverio y no sabe volar:(");
        }
        else{
            System.out.println(nombre+" sabe volar:)");
        }
        return cautiverio;
    }
}
