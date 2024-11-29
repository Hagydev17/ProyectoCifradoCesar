/**
 * Esta clase hace posible el descifrado en el ciclo del programa por completo.
 * La función permite recorrer la variable desplazamiento hacia atrás dependiendo la clave del cifrado.
 * El programa pide digitar el nombre del archivo que se desea descifrar.
 * El usuario puede navegar a la carpeta 'archivos_para_descifrar' y realizar el descifrado.
 * Incluyo un archivo de 'prueba', el cual contiene un texto predefinido.
 * Nombre del archivo: prueba.txt
 * Clave de descifrado: 3
 * @author Hagy G. Hernández
 * @since 2024
 * @version 1.0
 */
public class Descifrado {
    static String textoDescifrado;
    /**
     * Valida si el texto contiene solo caracteres permitidos del alfabeto.
     */
    public static void descifrarTexto() {
        System.out.println("Digite el texto que desea descifrar:");
        String texto = CesarEncryptor.scanner.next();

        if (ValidarAlfabeto.esTextoValido(texto, CesarEncryptor.alfabeto)) {
            System.out.println("Digite cuántos caracteres desea recorrer (clave de cifrado):");
            int desplazamiento = CesarEncryptor.scanner.nextInt();
            textoDescifrado = Cifrado.cifrarTexto(texto, -desplazamiento, CesarEncryptor.alfabeto);
            System.out.println("Texto descifrado: " + textoDescifrado+"\n");
        } else {
            System.err.println("El texto contiene caracteres no válidos.");
        }
    }
}