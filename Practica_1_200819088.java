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
public class Practica_1_200819088 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablero d = new Tablero();
        d.setVisible(true);
        Lista_Simple lista = new Lista_Simple();
        lista.agregarAlInicio("a");
        lista.agregarAlInicio("b");
        lista.agregarAlInicio("c");
        lista.agregarAlInicio("d");
        lista.agregarAlFinal("r");
        lista.agregarAlFinal("z");
        lista.agregarAlFinal("t");
        lista.imprimir();
        Lista_Circular list = new Lista_Circular();
        list.agregarAlInicio("a");
        list.agregarAlInicio("5");
        list.agregarAlFinal("1");
        list.agregarAlFinal("2");
        list.listar();
        // TODO code application logic here
    }
    
}
