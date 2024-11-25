
public class DesdeConsola {
    static String textoCifrado;

    public static void cifrarDesdeConsola() {
        System.out.println("Digite el texto que desea cifrar:");
        String texto = CesarEncryptor.scanner.next();

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
            int desplazamiento = CesarEncryptor.scanner.nextInt();

            textoCifrado = CesarEncryptor.cifrarTexto(texto, desplazamiento, CesarEncryptor.alfabeto);
            CrearArchivo.generarArchivo();
        } else {
            System.err.println("El texto contiene caracteres no válidos.");
        }
    }
}
