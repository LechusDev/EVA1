/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_clase_auto;

/**
 *
 * @author James
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miAuto = new  Automovil();
        miAuto.setMarca("Ford");
        miAuto.setModelo("Mustang");
        miAuto.setTipo("Sedan");
        miAuto.setAño(2022);
        miAuto.setColor("Rojo");
        miAuto.setPrecio(11667000.00);
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("año: " + miAuto.getAño());
    }
    
}

class Automovil{//TIPOS DE DATOS ABSTRACTOS
    //ATRIBUTOS - PRIVADOS
    private String marca;
    private String modelo; 
    private String tipo; 
    private int año; 
    private String color; 
    private double precio; 
    //COMPORTAMIENT
    //METODO SET/GET
    public void setMarca(String valor){
        marca = valor; 
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setTipo(String valor){
        tipo = valor;
    }
    public String getTipo(){
        return tipo;
    }
    public void setAño(int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }
    public void setColor(String valor){
        color = valor;
    }
    public String getColor(){
        return color;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public double getPrecio(){
        return precio;
    }
}