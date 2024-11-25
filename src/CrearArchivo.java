import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {
    static String nombreArchivo;

    public static void generarArchivo() {
        try {
            System.out.println("Digite el nombre del archivo: ");
            nombreArchivo = CesarEncryptor.scanner.next();

            File archivo = new File(
                    "C:\\Users\\Hagyh\\Desktop\\" +
                            "Java IntelliJ\\CifradoCesar\\" +
                            "archivos_para_descifrar\\" + nombreArchivo + ".txt");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente");
            } else {
                System.out.println("El archivo ya existe");
            }
            FileWriter fileWriter = new FileWriter(archivo);
            fileWriter.write("Texto cifrado: " + DesdeConsola.textoCifrado);
            fileWriter.close();

        } catch (IOException e) {
            System.err.println("Hubo un error");
        }
    }
}
