import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Esta clase permite al programa hacer el cifrado desde un documento .txt incluido en la carpeta 'archivos_para_cifrar'.
 * Pide al usuario ingresar el nombre del archivo.
 * Si el usuario digita un nombre incorrecto, el programa lanzará un mensaje diciendo que el archivo no existe.
 * Una vez ingresado el nombre del archivo correcto, se procede con el cifrado dependiendo la cantidad de elementos a desplazar.
 * Después de cifrarlo, pide al usuario si desea descifrar el archivo, si el usuario responde positivamente,
 * la consola lanzará el mensaje descifrado, de lo contrario dará un mensaje de despedida.
 * @author Hagy G. Hernández
 * @since 2024
 * @version 1.0
 */
public class DesdeArchivo {
    static String textoCifrado;

    public static void cifrarDesdeArchivo() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite el nombre del archivo");
            String nombreArchivo = scanner.nextLine();

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            "\\archivos_para_cifrar\\" + nombreArchivo + ".txt"));
            /*
            * Guardar el proyecto en la ruta deseada,
            * una vez dentro del proyecto,
            * copia y pega la ruta de la carpeta
            * y colócala dentro del FileRider
            */
            StringBuilder textoOriginal = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                textoOriginal.append(line).append("\n");
            }
            System.out.println("Digite el número de caracteres a desplazar:");
            int desplazamiento = scanner.nextInt();

            textoCifrado = Cifrado.cifrarTexto(textoOriginal.toString(), desplazamiento, CesarEncryptor.alfabeto);

            System.out.println("Texto cifrado:");
            System.out.println(textoCifrado);
            String respuesta;
            System.out.println("Descifrar? si/no");
            respuesta = CesarEncryptor.scanner.next();
            if(respuesta.equalsIgnoreCase("si")) {
                String textoDescifrado = Cifrado.cifrarTexto(textoCifrado, -desplazamiento, CesarEncryptor.alfabeto);
                System.out.println("Texto descifrado: " + textoDescifrado);
            } else {
                System.out.println("Adiós");
            }
        } catch (InputMismatchException e) {
            System.err.println("Debe ingresar un número válido.");
        } catch (IOException e) {
            System.err.println("El archivo no existe");
        }
    }
}