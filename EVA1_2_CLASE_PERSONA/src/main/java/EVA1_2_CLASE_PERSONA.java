/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author James
 */
public class EVA1_2_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo!!");
        Persona estudiante = new Persona();//declaro un identificador (objeto) tipo Persona
        estudiante.id = "00112233";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 10;
        estudiante.imprimirDatos();
        //CONCATENACION - PEGAR CADENAS DE TEXTO
        //"   " + ENTERO/BOOLEANO/STRING/DOUBLE
        System.out.println("Año de nacimiento: " + estudiante.calcularAñoNacimiento());
        
        Persona estudiante2 = new Persona();
        estudiante.nombre = "Ruben";
        estudiante.id = "11111";
        estudiante.edad = 40;
        estudiante.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante2.calcularAñoNacimiento());
        
        Persona estudiante3 = new Persona();
        estudiante.nombre = "Pedro";
        estudiante.id = "654654";
        estudiante.edad = 50;
        estudiante.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante3.calcularAñoNacimiento());
        
    }
    
}

class Persona{ //implementacion
    //ATRIBUTOS DE LA CLASE
    String id;
    String nombre;
    int edad;
    
    //COMPORTAMIENTO
    //metodo imprimir datos --  metodo/función -->  f(3) = x + 1
    //metodo imprimir + nombre de la funcion ( argumentos);
    void imprimirDatos(){//no regresa valor, el nombre es imprimirDatos(no recibe valores)
        System.out.println("El nombre es:" + nombre);
        System.out.println("Su id es:" + id);
        System.out.println("Su edad es: " + edad);
    }
    
    //calcular año de nacimiento
    boolean calcularAñoNacimiento() {//declaracion
            int añoNac = 2022 - edad;
            return añoNac;
    }
}

/* 
Persona:
//DATOS --> ATRIBUTOS DE LA CLASE
ID: Cacena
Edad: entero
sexo: char
direccion: cadena
telefono: cadena
estatura: real
curp: cadena
//COMPORTAMIENTO
capturar datos
consultar datos
*/
