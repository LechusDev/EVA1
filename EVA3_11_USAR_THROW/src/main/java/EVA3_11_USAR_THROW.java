
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_11_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("Introduce un valor entero positivo; ");
        int valor = entrada.nextInt();
        
        if(valor < 0)
            //throw sirve para generar una alternativa a las excepciones del sistema.
            //de esta manera generamos nuestros propios mecanismos de excpecion
            throw new Exception("El valor" + valor + " no es una edad valida!!");
             System.out.println("La edad ingresada es : " + valor);
        
    }catch(Exception e){
            e.printStackTrace();
}
       
    }
}
