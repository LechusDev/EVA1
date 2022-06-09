/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lechus
 */
public class EVA3_11_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            throw new Exception("Mi excepcion!!!");//se captura con try catch
        } catch (Exception ex) {
                ex.printStackTrace();
        }
        
        
        
    }
    
}