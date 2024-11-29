public class ValidarAlfabeto {
    /**
     * Este método valida si todos los caracteres de un texto están presentes en un alfabeto especificado.
     * @param texto: si el texto es válido devuelve true y ejecuta el cifrado.
     * @param alfabeto: verifica todos los caracteres del alfabeto, devuelve true si todos son válidos.
     * @return true si todos los caracteres del texto están en el alfabeto, false si alguno no lo está.
     */
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
}
