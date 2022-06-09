
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
       try{
        System.out.println("INtroduce un dato entero");
        int valor = entrada.nextInt();
        System.out.println("El valor es " + valor);
            
        
    
    }catch(InputMismatchException e){
        e.printStackTrace();
        
        
    }finally{
        //no importa la excepcion el finally siempre va a ejecutarse
        //aqui va codigo seguro o muy importante en caso de que el programa se cierre
        System.out.println("Esta linea siempre debe ejecutarse");
       }
        System.out.println("fin del programa");
    }
    
}
