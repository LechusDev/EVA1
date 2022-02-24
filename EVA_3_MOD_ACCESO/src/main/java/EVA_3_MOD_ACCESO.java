/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author James
 */
public class EVA_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona();//Instanciar (crear un objeto)
       per1.setId("00112233");
       per1.setNombre("JAIME");
       per1.setEdad(40);
       System.out.println("Nombre: " + per1.getNombre());
    }
    
}

class Persona {    
    //ATRIBUTOS (VARIABLES)
    private String id;
    private String nombre;
    private int edad;
    //COMPORTAMIENTO (METODOS)
    //PARA LEER Y MODIFICAR LOS ATRIBUTOS, USADOS METODOS DE LECTURA/ESCRITURA 
    //ASIGNAR -- SET
    //LEER --> GET
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    //ASIGNAR --> SET
    public void setId(String valor){
        id = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad (int valor){
        edad = valor;
    }
}