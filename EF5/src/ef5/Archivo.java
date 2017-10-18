/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose David
 */
public class Archivo {
    public String texto="";
    
    public String getTexto(){
    return texto;
    }
    
    public void Leer(String nombrearchivo){
       
        try {
            File archivo;
            FileReader fr;
            BufferedReader br;
            archivo=new File(nombrearchivo);
            fr = new FileReader (archivo);
            br=new BufferedReader(fr);
            
            String linea;
            try {
                //Lee cada linea y la concatena a un string global
                while((linea=br.readLine())!=null){
                    if(texto==null){
                    texto=linea;
                    
                    }else{
                        
                        texto=texto+linea;
                    
                    }
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
