import java.util.Random;
import java.util.Scanner;

public class StringGen {

    static public String generateString(Scanner Size) {
        Random r = new Random();

        char[] array = new char[Size.nextInt()];

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (r.nextInt(26) + 97);
            text.append(array[i]);
        }
        return text.toString();
    }

}
