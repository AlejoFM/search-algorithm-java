import java.util.Random;
import java.util.Scanner;

public class StringGen {

    static public String generateString(Integer Size) {
        Random r = new Random();

        char[] array = new char[Size ];

        StringBuilder text = new StringBuilder();

        char[] dnaChars = {'A', 'T', 'C', 'G'};


        for (int i = 0; i < array.length; i++) {
            int randomIndex = r.nextInt(4);
            array[i] = dnaChars[randomIndex];
            text.append(array[i]);
        }
        return text.toString();
    }

}
