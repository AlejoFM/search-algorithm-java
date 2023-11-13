import java.util.Random;

public class StringGen {

    static public String generateString(int Size) {
        Random r = new Random();

        char[] array = new char[Size];

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (r.nextInt(26) + 97);
            text.append(array[i]);
        }
        return text.toString();
    }

}
