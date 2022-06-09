/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lechus
 */
public class EVA2_15_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("001122", "Maria", 25);
        Docente docente = new Docente("036","Pedro",50);
        
        Persona persoEstu = estudiante;
        Estudiante estuPerso = persona;
    }    
}
