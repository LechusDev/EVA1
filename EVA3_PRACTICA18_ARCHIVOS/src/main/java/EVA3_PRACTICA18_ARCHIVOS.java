/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lechus
 */
public class EVA3_PRACTICA18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //RUTA:
            //FileInputStream
            FileInputStream archivo = new FileInputStream("C:\\Txt/Doc texto.txt");
            /*System.out.println("Leer: " + archivo.read());
            System.out.println("Leer: " + archivo.read());*/
            //Leer todo el archivo:
            int caracter = archivo.read();
            while(caracter != -1){
                System.out.print((char)caracter);
                caracter = archivo.read();
            }
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
