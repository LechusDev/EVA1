/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVA2_15_POLIMORFISMO;

/**
 *
 * @author Lechus
 */
public class Docente extends Persona{
    private String numeroRegistro;

    public Docente() {
    }

    public Docente(String numeroRegistro, String nombre, int edad) {
        super(nombre, edad);
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    
}
