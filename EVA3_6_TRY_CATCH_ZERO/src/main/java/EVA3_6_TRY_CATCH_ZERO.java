
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_6_TRY_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int entero = input.nextInt();
        
        System.out.println("Introduce tu edad en numero entero 2");
        int entero2 = input.nextInt();
                
        try{
            System.out.println("Diviosion: " + (entero/entero2));
        }catch(ArithmeticException e){//despues de la excepcion debemos de otorgarle una variable
           // e.printStackTrace();//imprime la excepcion sin quw el programa falle
            System.out.println("Se produjo un error");
        }
        //tambien se pueden producir excepciones dentro de nuestro try catch
        
        
        
        //excepciones sirven para evitar problemas en el prgrama
        
        
    }
    
}
