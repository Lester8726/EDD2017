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
public class Nodo {
    private String Dato;
    private Nodo Siguiente;
    
    public void Nodo(){
        this.Dato = null;
        this.Siguiente = null;
    }
        
    public String getValor() {
        return Dato;
    }

    public void setValor(String valor) {
        this.Dato = valor;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.Siguiente = siguiente;
    }  
    public void Cola (String x, Nodo enlace){
        Siguiente=enlace;
        Dato =x;
    }
}
