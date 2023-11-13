import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String stringGenerated = StringGen.generateString(10000);

        long startTime = System.currentTimeMillis();

        // FindMethodByJava.findMethodJava(stringGenerated,"ale");

        // FindMethodByAlejo.stringSearch(stringGenerated, "asd");

        long stopTime = System.currentTimeMillis();
        System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds."); // Se muestra por consolaa el tiempo de ejecución.
    }
}