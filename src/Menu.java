import java.util.InputMismatchException;

public class Menu {
    public void mostrarMenu() {
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
                case 4 -> System.out.println("Vuelva pronto!");
                default -> System.err.println("Opción no válida. Intente nuevamente.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Debe ingresar un número válido.");
        }
    }
}
