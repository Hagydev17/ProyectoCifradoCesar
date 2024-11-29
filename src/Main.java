/**
 * La clase Main es el punto de entrada para el programa.
 * En este caso, se encarga de ejecutar el Cifrado César al llamar al método.
 * {@link CesarEncryptor#ejecutar()}
 * @author Hagy G. Hernández.
 * @version 1.0.
 */
public class Main {
    /**
     * El método {@code main} inicia el programa.
     * Llama al método {@link CesarEncryptor#ejecutar()} para iniciar el proceso de cifrado.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CesarEncryptor.ejecutar();
    }
}