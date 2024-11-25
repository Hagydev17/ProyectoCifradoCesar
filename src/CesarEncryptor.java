import java.util.InputMismatchException;
import java.util.Scanner;

public class CesarEncryptor {
    static Scanner scanner = new Scanner(System.in);
    static char[] alfabeto = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ', ',', '.', '!', '"', '#', '$', '%', '&', '/', '(', ')'};

    public static void ejecutar() {
        System.out.println("""
                ==== Cifrado César ====
                1.- Cifrar texto
                2.- Cifrar desde archivo
                3.- Descifrar texto
                4.- Salir
                """);

        try {
            int opc = scanner.nextInt();
            switch (opc) {
                case 1 -> DesdeConsola.cifrarDesdeConsola();
                case 2 -> DesdeArchivo.cifrarDesdeArchivo();
                case 3 -> Descifrado.descifrarTexto();
                case 4 -> System.out.println("Vuelva pronto!");
                default -> System.err.println("Opción no válida. Intente nuevamente.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Debe ingresar un número válido.");
        }
    }

    public static boolean esTextoValido(String texto, char[] alfabeto) {
        for (char c : texto.toCharArray()) {
            boolean encontrado = false;
            for (char letra : alfabeto) {
                if (c == letra) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                return false;
            }
        }
        return true;
    }

    public static String cifrarTexto(String texto, int desplazamiento, char[] alfabeto) {
        StringBuilder resultado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            int index = -1;
            for (int i = 0; i < alfabeto.length; i++) {
                if (alfabeto[i] == c) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                int nuevoIndex = (index + desplazamiento + alfabeto.length) % alfabeto.length;
                resultado.append(alfabeto[nuevoIndex]);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}