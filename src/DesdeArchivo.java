import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class DesdeArchivo {
    public static void cifrarDesdeArchivo() {
        try {
            System.out.println("Digite cuántos caracteres desea desplazar:");
            int desplazamiento = CesarEncryptor.scanner.nextInt();

            BufferedReader reader = new BufferedReader(new FileReader("aquí voy a colocar la ruta del archivo.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (CesarEncryptor.esTextoValido(line, CesarEncryptor.alfabeto)) {
                    String textoCifrado = CesarEncryptor.cifrarTexto(line, desplazamiento, CesarEncryptor.alfabeto);
                    System.out.println("Texto cifrado desde archivo:\n" + textoCifrado);
                } else {
                    System.err.println("El archivo contiene caracteres no válidos.");
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Debe ingresar un número válido.");
        }
    }
}
