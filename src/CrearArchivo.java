import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
    public static void generarArchivo() {
        try {
            File archivo = new File("miArchivo.txt");
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente. Verifique el archivo '.txt'");
            } else {
                JOptionPane.showMessageDialog(null, "El archivo ya existe"); // Trabajar en esta línea, actualmente, si el archivo ya ha sido creado el metodo no pasa por este 'else', por lo que crea un scanner sin final.
            }

            FileWriter fileWriter = new FileWriter(archivo);
            fileWriter.write(DesdeConsola.textoCifrado);
            fileWriter.close();

        } catch(IOException e){
            System.err.println("Hubo un error");
        }
    }
    public static void generarArchivo2() {
        try {
            File archivo2 = new File("miArchivo2.txt");
            if(archivo2.createNewFile()) {
                System.out.println("Archivo creado exitosamente. Verifique el archivo 2'.txt'");
            } else {
                JOptionPane.showMessageDialog(null, "El archivo ya existe"); // Lo mismo aquí, REVISAR
            }

            FileWriter fileWriter = new FileWriter(archivo2);
            fileWriter.write(DesdeArchivo.textoCifrado);
            fileWriter.close();

        } catch(IOException e){
            System.err.println("Hubo un error");
        }
    }
}
