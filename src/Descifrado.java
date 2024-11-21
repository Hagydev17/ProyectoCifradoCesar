public class Descifrado {
    public static void descifrarTexto() {
        System.out.println("Digite el texto que desea descifrar:");
        String texto = CesarEncryptor.scanner.next();

        if (CesarEncryptor.esTextoValido(texto, CesarEncryptor.alfabeto)) {
            System.out.println("Digite cuántos caracteres desea recorrer (clave de cifrado):");
            int desplazamiento = CesarEncryptor.scanner.nextInt();
            String textoDescifrado = CesarEncryptor.cifrarTexto(texto, -desplazamiento, CesarEncryptor.alfabeto);
            System.out.println("Texto descifrado: " + textoDescifrado);
        } else {
            System.err.println("El texto contiene caracteres no válidos.");
        }
    }
}