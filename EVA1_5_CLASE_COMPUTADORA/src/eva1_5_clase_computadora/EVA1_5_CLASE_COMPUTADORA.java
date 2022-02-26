/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_clase_computadora;

/**
 *
 * @author James
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1 = new Computadora();
        pc1.setProcesador("Ryzen 5 3600x");
        pc1.setGrafica("gtx 1660 super");
        pc1.setRam(16);
        pc1.setMotherboard("A320");
        pc1.setFuente("EVGA 500w");
        pc1.setGabinete("nzxt");
        pc1.setPrecio(25000);
        pc1.imprimirDatos();
    }
    
}
class Computadora{
    private String procesador;
    private String grafica;
    private int ram;
    private String motherboard;
    private String fuente;
    private String gabinete;
    private double precio;
    private double precioTotal;
    
    public void setProcesador(String valor){
        procesador = valor;
    }
    public String getProcesador(){
        return procesador;
    }
    public void setGrafica(String valor){
        grafica = valor;
    }
    public String getGrafica(){
        return grafica;
    }
    public void setRam(int valor){
        ram = valor;
    }
    public int getRam(){
        return ram;
    }
    public void setMotherboard(String valor){
        motherboard = valor;
    }
    public String getMotherboard(){
        return motherboard;
    }
    public void setFuente(String valor){
        fuente = valor;
    }
    public String getFuente(){
        return fuente;
    }
    public void setGabinete(String valor){
        gabinete = valor;
    }
    public String getGabinete(){
        return gabinete;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public double getPrecioTotal(){
        return precioTotal;
    }
    public void imprimirDatos(){
        precioTotal = precio*.16 + precio;
        System.out.println("Atributos: ");
        System.out.println("Procesador: " + procesador);
        System.out.println("Grafica: " + grafica);
        System.out.println("Ram: " + ram);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Fuente: " + fuente);
        System.out.println("Gabinete: " + gabinete);
        System.out.println("Precio Total: " + precioTotal);
    }
}