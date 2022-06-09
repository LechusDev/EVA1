/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_4_NULLPOINTEREXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona persona = null;
        
        imprimir(persona);
                
      /*Las excepciones son como el fuego, se van a propagar*/
      //si no se sabe controlar excepcinoes, no las controles
      
    }
    public static void imprimir (Persona perso){
        masComplicado(perso);
    }
    public static void masComplicado(Persona perso){
        System.out.println("Nombre" + perso.getNombre());
        
    }
     public class Persona{
            String Nombre;

            public Persona() {
            }

            public Persona(String Nombre) {
                this.Nombre = Nombre;
            }

            public String getNombre() {
                return Nombre;
            }

            public void setNombre(String Nombre) {
                this.Nombre = Nombre;
            }
            
            
        }
    
}
