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
public class Desincriptador  {

    
    
    
    
    
    
    
    
    
    
    public String desincriptar(int codigo){
        String resultado = null;
        int p;
        
        p = (codigo - 3) % 26;
        
       if(p ==0){
           resultado = "A";
       } 
       if(p == 1){
           resultado = "B";
       } 
        if(p ==2){
           resultado = "C";
       } 
        if(p ==3){
           resultado = "D";
       } 
         if(p ==4){
           resultado = "E";
       } 
        if(p ==5){
           resultado = "F";
       } 
      if(p ==6){
           resultado = "G";
       } 
       if(p ==7){
           resultado = "H";
       } 
       if(p ==8){
           resultado = "I";
       } 
       if(p ==9){
           resultado = "J";
       } 
       if(p ==10){
           resultado = "K";
       } 
       if(p ==11){
           resultado = "L";
       } 
       if(p ==12){
           resultado = "M";
       } 
       if(p ==13){
           resultado = "N";
       } 
       if(p ==14){
           resultado = "O";
       } 
       if(p ==15){
           resultado = "P";
       } 
       if(p ==16){
           resultado = "Q";
       } 
       if(p ==17){
           resultado = "R";
       } if(p ==18){
           resultado = "S";
       } 
       if(p ==19){
           resultado = "T";
       } 
        if(p ==20){
           resultado = "U";
       }      
        if(p ==21){
           resultado = "V";
       } 
       if(p ==22){
           resultado = "W";
       } 
       if(p ==23){
           resultado = "X";
       } 
       if(p ==24){
           resultado = "Y";
       } 
       if(p ==25){
           resultado = "Z";
       } 
        return resultado;
    }
    
}
