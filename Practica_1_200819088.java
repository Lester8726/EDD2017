/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_1_200819088;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author PC 1
 */
public class Practica_1_200819088 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Hola Mundo");


Lista_Circular oo = new Lista_Circular();
oo.agregarAlInicio("a");
oo.agregarAlFinal("d");
oo.agregarAlFinal("d");
oo.agregarAlFinal("s");
oo.agregarAlFinal("t");
oo.agregarAlFinal("g");
oo.imprimir();;



        Cola cola1=new Cola();
        cola1.insertar("hh");
        cola1.insertar("ll");
        cola1.insertar("bb");
        cola1.imprimir();
        System.out.println("Extraemos uno de la cola:"+cola1.extraer());


    try {
      
      String dotPath = "C:\\Users\\PC 1\\Desktop\\release\\bin\\dot.exe";
      
      String fileInputPath = "C:\\grafos\\grafo1.txt";
      String fileOutputPath = "C:\\grafos\\grafo1.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
    }
    
    
    

    } 
}
