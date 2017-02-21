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
public class Cola {

        class NodoCola {
        String info;
        NodoCola sig;
    }
    
    private NodoCola raiz,fondo;
    
    Cola() {
        raiz=null;
        fondo=null;
    }
    
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (String info)
    {
        NodoCola nuevo;
        nuevo = new NodoCola ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    String extraer ()
    {
        if (!vacia ())
        {
            String informacion = raiz.info;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else{

    }
        return null;

}
    public void imprimir() {
        NodoCola reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
                       try {

             java.io.BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\grafos\\grafo1.txt"));  
              		bufferedWriter.append("digraph G");
			bufferedWriter.flush();
                        bufferedWriter.newLine();
                        bufferedWriter.append("{");
			bufferedWriter.flush();
                        bufferedWriter.newLine();
                        
        while (reco!=null) {
            
            if (reco.sig != null){
            System.out.print(reco.info+"-");

                        bufferedWriter.append(reco.info + "->");
			bufferedWriter.flush(); 
                        reco=reco.sig;
            }else{
                System.out.print(reco.info);
                        bufferedWriter.append(reco.info + "");
			bufferedWriter.flush(); 
                        reco=reco.sig;
            }
            
            
        }
        
    bufferedWriter.newLine();
    bufferedWriter.append("}");
    bufferedWriter.flush();
                       }catch (IOException e) {
			e.printStackTrace();
		}
        
        System.out.println();
    }
}