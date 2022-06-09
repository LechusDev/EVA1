
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona persona = new Persona();
        persona.setNombre("Sebastian Emilio");
        try {
            persona.setEdad(20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            Persona persona2 = new Persona("Sebastian Emilio", capturarEdad());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static int capturarEdad() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Captura la edad");
        int valor = 0;
        try{
            valor = sc.nextInt();
        }catch(InputMismatchException ex){
            throw new Exception("Introdujiste una cadena de texto, no es un número válido.");
        }
        return valor;
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
