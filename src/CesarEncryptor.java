import java.util.Scanner;

public class CesarEncryptor {
    static Scanner scanner = new Scanner(System.in);
    static char[] alfabeto = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ', ',', '.', '!', '"', '#', '$', '%', '&', '/', '(', ')',
            'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú'};

    public static void ejecutar() {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}