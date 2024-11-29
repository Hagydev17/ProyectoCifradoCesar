import java.util.Scanner;
/**
 * Esta clase permite cifrar un texto desde la consola, una vez digitado el texto, se lanza una pequeña animación con tres puntos que simula que el programa está procesando el texto.
 * Hasta este punto el programa pide cuántos caracteres se desean desplazar.
 * Una vez cifrado, el programa crea un archivo .txt, el cual se guarda en la carpeta 'archivos_para_descifrar'.
 * Se repite la ejecución y el usuario puede navegar a la carpeta con el archivo ya creado.
 * En el menú puede digitar la opción 3 (descifrar) y copiar y pegar el texto en el archivo recién agregado.
 * Se coloca la clave que se usó para cifrarlo y el programa lo descifrará.
 * @author Hagy G. Hernández
 * @since 2024
 * @version 1.0
 */
public class DesdeConsola {
    static String textoCifrado;

    public static void cifrarDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el texto que desea cifrar:");
        String texto = scanner.nextLine();

        if (ValidarAlfabeto.esTextoValido(texto, CesarEncryptor.alfabeto)) {
            try {
                System.out.println("Texto correcto, procediendo con el cifrado");
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1000);
                    System.out.print(".");
                }
                System.out.println();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Hubo un error en la ejecución del hilo");
            }
            System.out.println("Digite el número de caracteres a desplazar:");
            int desplazamiento = CesarEncryptor.scanner.nextInt();

            textoCifrado = Cifrado.cifrarTexto(texto, desplazamiento, CesarEncryptor.alfabeto);
            CrearArchivo.generarArchivo();
        } else {
            System.err.println("El texto contiene caracteres no válidos.");
        }
    }
}
