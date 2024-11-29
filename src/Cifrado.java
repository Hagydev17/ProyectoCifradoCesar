/**
 * La clase {@code Cifrado} gestiona toda la logica del cifrado de los textos
 * Contiene un metodo estático que pide tres parámetros.
 *
 * @author Hagy G. Hernández
 * @since 2024
 * @version 1.0
 */
public class Cifrado {
    /**
     * @param texto: Es el texto que se digita.
     * @param desplazamiento: La cantidad de elementos que se desea desplazar.
     * @param alfabeto: El array que contiene todos los caracteres, tanto alfabeto como caracteres especiales.
     * @return El texto cifrado con el desplazamiento especificado.
     */
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
