/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1_200819088;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PC 1
 */
public class Lista_Simple {
    
    private Nodo inicio;
    private int tamanio;
    
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(String Dato){
        Nodo nuevo = new Nodo();
        nuevo.setValor(Dato);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            Nodo Auxiliar = inicio;
            while(Auxiliar.getSiguiente() != null){
                Auxiliar = Auxiliar.getSiguiente();
            }
            Auxiliar.setSiguiente(nuevo);
        }
        tamanio++;
    }
        public boolean buscar(String referencia){
        Nodo aux = inicio;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }
        
        public void removerPorReferencia(String referencia){
        if (buscar(referencia)) {
            if (inicio.getValor() == referencia) {
                inicio = inicio.getSiguiente();
            } else{
                Nodo aux = inicio;
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);  
            }
            tamanio--;
        }
    }
        
        
        public void editarPorPosicion(int posicion , String valor){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio.setValor(valor);
            }
            else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setValor(valor);
            }
        }
    }
    
    public void agregarAlInicio(String Dato){
        Nodo nuevo = new Nodo();
        nuevo.setValor(Dato);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }
    
    public void imprimir(){

        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
                try {

             java.io.BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\grafos\\grafo1.txt"));  
              		bufferedWriter.append("digraph G");
			bufferedWriter.flush();
                        bufferedWriter.newLine();
                        bufferedWriter.append("{");
			bufferedWriter.flush();
                        bufferedWriter.newLine();
    while(aux != null){
        if(aux.getSiguiente() != null){
                System.out.print(i + ".( " + aux.getValor() + " )" + " ->  ");
                        
                        bufferedWriter.append(aux.getValor() + "->");
			bufferedWriter.flush(); 
                        aux = aux.getSiguiente();
                        i++;
                        }else{
        
                        System.out.print(i + ".( " + aux.getValor() + " )");
                        
                        bufferedWriter.append(aux.getValor());
			bufferedWriter.flush(); 
                        aux = aux.getSiguiente();
                        i++;
        }
            }
     bufferedWriter.newLine();
    bufferedWriter.append("}");
    bufferedWriter.flush();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        }
    }

    
}

