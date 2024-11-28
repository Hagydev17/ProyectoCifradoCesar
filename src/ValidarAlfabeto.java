public class ValidarAlfabeto {
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
