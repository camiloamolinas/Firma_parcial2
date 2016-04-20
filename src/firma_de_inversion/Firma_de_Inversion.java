/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firma_de_inversion;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Firma_de_Inversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
    File datos = new File("datos.txt"); 
    //Filereader datosreader = new  Filereader("datos.txt");   
    PrintStream output = new PrintStream( new File("datos_des.txt"));
    Scanner leer = new Scanner(datos); 
    // BufferedReader entrada = new BufferedReader(datos);
    
    FileReader datos_char = new FileReader("datos.txt");
    int   letra;
    
    letra = datos_char.read();
    
        System.out.println((char) letra);
    
        
        
   String  palabra;
   
   int numero;
      //  numero = leer.next();
        palabra = leer.next();
        System.out.println(palabra);
        
    
    
    
        
        
    }
    
}
