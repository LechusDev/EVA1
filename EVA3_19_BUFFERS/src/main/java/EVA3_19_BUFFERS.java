/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Lechus
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //definir la ruta       //paths te ayuda a definir rutas en diferentes formatos,permite relaizar muchas funciones
        Path ruta = Paths.get("c:/archivo/texton.txt");
        //abrimos el archivo
        InputStream abrirArch;
        //leemos el archivo
        InputStreamReader leerArch;
        //convertimos bytes a caracteres
        BufferedReader leerTexto;
        
        try{
        abrirArch = Files.newInputStream(ruta);
        leerArch  = new InputStreamReader(abrirArch);
        String linea = leerTexto.readLine();
        while(linea !=null){
            System.out.println(linea);
            linea = leerTexto.readLine();
        }
        leerTexto.close();//siempre es muy importante cerrar el stream
        }catch(IOException ex){
    
}
    }
    
}
