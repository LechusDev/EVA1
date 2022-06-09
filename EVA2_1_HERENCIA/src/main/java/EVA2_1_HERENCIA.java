/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona perso1 = new Persona();
        //perso1.
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("JUANA");
        estu1.setEdad(22);
        estu1.setNumeroControl("00112233");
        estu1.imprimirDatos();
        System.out.println("No de control: " + estu1.getNumeroControl());
    }
    
}
class Estudiante extends Persona{
    private String numeroControl;

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    
}

class Persona{//SUPERCLASE (PADRE)
    private String nombre;
    private int edad;
    
    public Persona(){
        this.nombre = "";
        this.edad = 0;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}