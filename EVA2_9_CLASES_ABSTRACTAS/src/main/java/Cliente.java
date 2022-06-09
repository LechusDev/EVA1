/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class Cliente extends Persona {
    private String RFC;

    public Cliente() {
    }

    public Cliente(String RFC, String nombre, int edad) {
        super(nombre, edad);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre :" + nombre);
        System.out.println("Edad :" + edad);
        System.out.println("RFC :" + RFC);
        
    }
    
}
