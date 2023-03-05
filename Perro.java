package org.example;

public class Perro {

    private String raza;
    private String pelaje;
    private String nombre;
    private boolean manchas;
    private float tamano;

    public Perro() {
    }

    public Perro(String raza, String pelaje, String nombre, boolean manchas, float tamano) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.nombre = nombre;
        this.manchas = manchas;
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isManchas() {
        return manchas;
    }

    public void setManchas(boolean manchas) {
        this.manchas = manchas;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", manchas=" + manchas +
                ", tamaño=" + tamano +
                '}';
    }

    public int alimentacion(){
        int kg = (int)(tamano*0.05);
        System.out.println(nombre+" consume "+kg+" kg de alimento a la semana");
        return kg;
    }

    public String dar_patita(){

        if(raza=="Husky" || raza=="Pastor Aleman" || raza== "Labrador"){
            System.out.println(nombre+" comunmente da la patita");
        }
        else{

            System.out.println(nombre+" casi no da la patita");
        }
        return raza;
    }

    public int correr(){
        int recorrido = (int)(Math.random()*100);
        System.out.println("Hoy "+nombre+" corrió "+recorrido+" kilometros");
        return recorrido;
    }

}
