package org.example;

public class Heroe {

    //ATRIBUTOS
    private String nombre;
    private int poder; //debe estar entre 0 y 100

    //METODOS ESPECIALES
    // CONSTRUCTORES

    public Heroe() {
    }

    public Heroe(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    //METODOS ESPECIALES
    //SETTER Y GETTER

    //Metodos del nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos del poder

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if(poder>=0 && poder>=100){
            this.poder = poder;
        }else{
            System.out.println("Poder incorrecto");
        }
    }

    //METODOS ORDINARIOS
    public String saludar(String nombre){
        return("Te vencere "+nombre);
    }
}
