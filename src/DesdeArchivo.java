import java.io.*;
import java.util.InputMismatchException;


public class DesdeArchivo {
    static String textoCifrado;

    public static void cifrarDesdeArchivo() {
        try {
            System.out.println("Digite el nombre del archivo");
            String nombreArchivo = CesarEncryptor.scanner.next();

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(
                            "C:\\Users\\Hagyh\\Desktop\\Java IntelliJ\\CifradoCesar\\archivos_para_cifrar\\" +
                                    nombreArchivo + ".txt"));

            StringBuilder textoOriginal = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                textoOriginal.append(line).append("\n");
            }
            System.out.println("Digite el número de caracteres a desplazar:");
            int desplazamiento = CesarEncryptor.scanner.nextInt();

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
            System.err.println();
        }
    }
}