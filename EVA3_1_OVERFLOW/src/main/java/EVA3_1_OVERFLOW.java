/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_1_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static int cont = 0;//le damos valor a cont de 0 para que cuente desde cero.
    
    /*exceptions--no es tan malo 
desviacion del flujo normal del programa
SON AVISOS QUE SE PUEDEN CONTROLAR 
TOMAR ACCIONES Y POTENCIALMENTE CORREGIR 
DETIENE EL PROGRAMA SI NO SE CONTROLA 
    Como generar excepciones
    
errors-- apocalipsis
	Son generados por el sistema operativo 
	Son fatales.*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
        
        int cont = 0;
        
       
        
        
    }
    
    //Realizamos stack para que se ejecute hasta que de fallas en el programa.
    //Se acaba la memoria de la compu y se elimina de la memoria.
    public static void terminarStack(){
        
        
        //creamos contador para saber cuantas veces se produce el stack
        
        cont = cont + 1;
        System.out.println(cont);
        terminarStack();
        
    }
    
    
    
}
