package org.example;

public class PerroDriver {

    public static void main(String[] args) {
        Perro lobito = new Perro("Husky","Lacio","Lobito",true,157);
        System.out.println(lobito.alimentacion());
        System.out.println(lobito.dar_patita());
        System.out.println(lobito.correr());
        System.out.println(lobito);



    }
}
