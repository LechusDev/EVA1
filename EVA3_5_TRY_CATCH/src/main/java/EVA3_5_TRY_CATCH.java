
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //try catch intenta resolver la excepcion.
        //las excepciones terminan siendo objetos.
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
         int iedad = input.nextInt();
         int iedad = 0;
        
        
        //intenta atrapar una excepcion para que pueda intervenir el catch.
        try{ 
            int iedad = input.nextInt();
           //dentro de try va el codigo que podria fallar 
        }catch(InputMismatchException e){
            //e.printStackTrace();
            System.out.println("Ocurrio un fallo en el programa");
            
            //dentro de catch va el codigo que se debe ejecutar por si falla 
            
        }
        System.out.println("Tu edad:" + iedad);
        
    }
    
}
