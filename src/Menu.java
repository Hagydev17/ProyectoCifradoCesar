import java.util.InputMismatchException;
/**
 * La clase Menu proporciona una pequeña interfaz
 * para que el usuario pueda interactuar con las funcionalidades del programa.
 * Presenta opciones para cifrar texto, descifrar o salir del programa.
 * @author Hagy G. Hernández
 * @version 1.0
 * @since 2024
 */
public class Menu {
    /**
     * Muestra el menú principal y gestiona la entrada del usuario.
     * Según la opción seleccionada, invoca un determinado método para cifrar o descifrar textos.
     * También manejan errores de entrada.
     *
     * @throws InputMismatchException Si el usuario ingresa un valor no numérico.
     * @see CesarEncryptor
     * @see DesdeConsola
     * @see DesdeArchivo
     * @see Descifrado
     */
    public void mostrarMenu() {
        while (true) {
            System.out.println("""
                    ==== Cifrado César ====
                    1.- Cifrar texto
                    2.- Cifrar desde archivo
                    3.- Descifrar texto
                    4.- Salir
                    """);

            try {
                int opc = CesarEncryptor.scanner.nextInt();
                switch (opc) {
                    case 1 -> DesdeConsola.cifrarDesdeConsola();
                    case 2 -> DesdeArchivo.cifrarDesdeArchivo();
                    case 3 -> Descifrado.descifrarTexto();
                    case 4 -> {
                        System.out.println("Vuelva pronto!");
                        return;
                    }
                    default -> System.err.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Debe ingresar un número válido.");
            }
        }
    }
}
