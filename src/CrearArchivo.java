import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * La clase {@code CrearArchivo} declara un método que genera un archivo .txt.
 * Se crea una instancia de la clase {@code File} y se especifica la ruta donde lo creará.
 * Si el archivo es creado, lanza un mensaje exitoso, de lo contrario puede ser que el archivo ya haya sido creado.
 * Este proceso está envuelto en un bloque {@code try-catch} para manejar excepciones
 * relacionadas con la creación y escritura del archivo (por ejemplo, {@link IOException} si hay problemas de acceso).
 * @author Hagy G. Hernández
 * @since 2024
 * @version 1.0
 */
public class CrearArchivo {
    static String nombreArchivo;
    /**
     * Este método solicita al usuario un nombre de archivo, crea un archivo .txt en la ruta especificada
     * y escribe el texto cifrado dentro del archivo.
     * Si el archivo no existe, se crea un nuevo archivo; si ya existe, se muestra un mensaje informando de ello.
     */
    public static void generarArchivo() {
        try {
            System.out.println("Digite el nombre del archivo: ");
            nombreArchivo = CesarEncryptor.scanner.next();

            File archivo = new File("archivos_para_descifrar\\" + nombreArchivo + ".txt");
            /*
             * Crear el proyecto en la ruta deseada,
             * copia y pega la ruta de la carpeta
             * y colócala dentro del File
             */
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente\n");
            } else {
                System.out.println("El archivo ya existe\n");
            }
            FileWriter fileWriter = new FileWriter(archivo);
            fileWriter.write("Texto cifrado: " + DesdeConsola.textoCifrado);
            fileWriter.close();

        } catch (IOException e) {
            System.err.println("Hubo un error");
        }
    }
}
