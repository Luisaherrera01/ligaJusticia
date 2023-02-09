package org.example;

import clases.Villano;
import org.example.paquetico.Pareja;

public class CuartelGeneral {
    public static void main(String[] args) {

        // Creo un objeto heroe
        Heroe heroe = new Heroe();
        heroe.setNombre("Batman");
        heroe.setPoder(800);

        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPoder());

        // Creo un objeto villano
        Villano villano = new Villano();


        // Creo una objeto pareja
        Pareja pareja = new Pareja("lUISA");

    }
}