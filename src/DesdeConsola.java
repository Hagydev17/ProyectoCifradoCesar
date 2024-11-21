import java.util.Scanner;

public class DesdeConsola {
    public static void cifrarDesdeConsola() {
        System.out.println("Digite el texto que desea cifrar:");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        if (CesarEncryptor.esTextoValido(texto, CesarEncryptor.alfabeto)) {
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
            int desplazamiento = scanner.nextInt();

            String textoCifrado = CesarEncryptor.cifrarTexto(texto, desplazamiento, CesarEncryptor.alfabeto);
            System.out.println("Texto cifrado: " + textoCifrado);
        } else {
            System.err.println("El texto contiene caracteres no válidos.");
        }
    }
}
