import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class DesdeArchivo {
    static String textoCifrado;

    public static void cifrarDesdeArchivo() {
        try {
            System.out.println("Digite cuántos caracteres desea desplazar:");
            int desplazamiento = CesarEncryptor.scanner.nextInt();

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Hagyh\\Desktop\\Java IntelliJ\\CifradoCesar\\miArchivo.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (CesarEncryptor.esTextoValido(line, CesarEncryptor.alfabeto)) {
                    textoCifrado = CesarEncryptor.cifrarTexto(line, desplazamiento, CesarEncryptor.alfabeto);
                    System.out.println("Texto cifrado desde archivo.\n");
                } else {
                    System.err.println("El archivo contiene caracteres no válidos.");
                }
            }
            CrearArchivo.generarArchivo2();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Debe ingresar un número válido.");
        }
    }
}
