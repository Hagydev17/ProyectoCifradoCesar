public class Cifrado {
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
