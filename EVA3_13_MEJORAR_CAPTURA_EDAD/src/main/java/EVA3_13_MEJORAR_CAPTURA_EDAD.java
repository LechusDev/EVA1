
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
public class EVA3_13_MEJORAR_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         
         boolean datoErroneo = true;//el usuario siempre se equivoca
         //para do while se utiliza booleano por terminos de true false
         
         do{
        try{
            System.out.println("Introduce tu edad en numero entero");
            int iedad = input.nextInt();
            System.out.println("Tu edad:" + iedad);
            
            
            
             if(iedad < 0)
            //throw sirve para generar una alternativa a las excepciones del sistema.
            //de esta manera generamos nuestros propios mecanismos de excpecion
            throw new Exception("El valor" + iedad + " no es una edad valida!!");
             
             datoErroneo = false;//el dato es falso el do while ya no se va  a repetir.
             System.out.println("La edad ingresada es : " + iedad);
            
                    

       
        }
        
        catch(InputMismatchException r){
            System.out.println(input.next() + "no es numero valido");
        }
        catch(Exception e){
            System.out.println("Este no es numero valido");
            
        }
         }while(datoErroneo);//el dato es erroneo se vulve a repetir
    }
    
}
