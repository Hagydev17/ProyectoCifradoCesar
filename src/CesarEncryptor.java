import java.util.Scanner;
/**
 * La clase {@code CesarEncryptor} gestiona la entrada de datos al sistema.
 * Contiene el alfabeto utilizado por el programa, y el método {@link #ejecutar()}, el cual
 * crea una instancia, invocando al método que muestra el menú.
 * @author Hagy G. Hernández
 * @since 2024
 * @version 1.0
 */
public class CesarEncryptor {
    /**
     * El array estático 'alfabeto' contiene todos los caracteres que se necesitan para cifrar los textos.
     * El método {@link #ejecutar()} crea una instancia de la clase Menu.
     * {@link Menu#mostrarMenu()} gestiona toda la lógica encapsulada en cada caso.
     */
    static Scanner scanner = new Scanner(System.in);

    static char[] alfabeto = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ', ',', '.', '!', '"', '#', '$', '%', '&', '/',
            'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú'};

    public static void ejecutar() {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}