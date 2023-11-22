import java.util.ArrayList;
import java.util.List;

public class FindMethodByAlejo {
    public static List<Integer> stringSearch(String string, String pattern) {

        List<Integer> positions = new ArrayList<>();

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
                positions.add(i); //Agrega la posición inicial de coincidencia.
            }
        }

        return positions;
    }
}
