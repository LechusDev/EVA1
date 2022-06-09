/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_15_THROW_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona persona = new Persona();
        persona.setNombre("ANDRES SAENZ");
        try {
            persona.setEdad(20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            Persona persona2 = new Persona("ANDRES SAENZ", 20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
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

    public void setEdad(int edad) throws Exception {
        if(edad >= 0 && edad <= 130){
            this.edad = edad;
        }else{
            throw new Exception("Rango de edad incorrecto");
        }
    }
}
