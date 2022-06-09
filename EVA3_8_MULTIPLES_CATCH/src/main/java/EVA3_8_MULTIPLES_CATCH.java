
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_8_MULTIPLES_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
       
             
        //intentamos atrapar la excepcion
        
        try{//aqui va el codigo que puede fallar
             System.out.println("Introduce tu edad en numero entero");
            int entero = input.nextInt();
        
            System.out.println("Introduce tu edad en numero entero 2");
            int entero2 = input.nextInt();
            System.out.println("Division: " + (entero/entero2));
        
        }catch(ArithmeticException e){//despues de la excepcion debemos de otorgarle una variable
            //Catch nos da una accion que puede resolver la excepcion que ingreso el usuario
           // e.printStackTrace();//imprime la excepcion sin que el programa falle
            System.out.println("Se produjo un error");
        }
        catch(InputMismatchException i){
                    System.out.println("El valor capturado no es valido");
                    }
        
    }
    
}
