package clases;

import org.example.Heroe;

public class Villano {

    private String nombre;
    private int poder;
    private Heroe heroe;


    //metodo ordinario
    public int destruir(){
        int resultado = this.poder-this.heroe.getPoder();
        return resultado;
    }
}
