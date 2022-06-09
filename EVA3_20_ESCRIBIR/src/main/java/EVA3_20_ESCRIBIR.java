/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Lechus
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path ruta = Paths.get("c:/Archivo/texto1.txt") 
                OutputStream abrirArchivo;
                OUtputStreamWriter escribirArh;
                BufferedWriter excribirtexto;
                try{
                abrirArchivo = Files.newOutputStream(ruta);
                escribirArh = new OutputStreamWriter(abrirArchivo);
                
                excribirtexto = new BufferedWriter(escribirArh);
                excribirtexto.write("Hola mundooo");
                excribirtexto.flush();
                excribirtexto.fush();
                excribirtexto.close();
                
                
                        
                
    }  
                catch(IOException ex){
                    ex.printStacktTrace;
                }
    }
    
}
