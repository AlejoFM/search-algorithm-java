public class FindMethodByAlejo {
    public static int stringSearch(String string, String pattern) {
        int longitudTexto = string.length();
        int longitudPatron = pattern.length();

        for (int i = 0; i <= longitudTexto - longitudPatron; i++) {
            int j;

            for (j = 0; j < longitudPatron; j++) {
                if (string.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == longitudPatron) {
                System.out.println("La subcadena se encontró en la posición " + i);
                return i; // Retorna la posición donde se encuentra la subcadena
            }
        }
        System.out.println("La subcadena no se encontró en el texto.");
        return -1; // Retorna -1 si no se encuentra la subcadena
    }
}
