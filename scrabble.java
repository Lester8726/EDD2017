/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1_200819088;

/**
 *
 * @author PC 1
 */
public class scrabble {
    private String nombre;
    private Lista_Simple Libro = new Lista_Simple();

    public scrabble() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista_Simple getLibro() {
        return Libro;
    }

    public void setLibro(Lista_Simple Libro) {
        this.Libro = Libro;
    }
    
}
