import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del string: ");
        Scanner stringSize = new Scanner(System.in); //Gen era el tamaño del string mediante input por el usuario
        String stringGenerated = StringGen.generateString(stringSize);
        System.out.println("Ingrese el tamaño del patrón a buscar dentro del string : ");
        Scanner patternSize = new Scanner(System.in); //Genera el tamaño del patrón mediante input por el usuario
        String patternGenerated = StringGen.generateString(patternSize);


        long startTimeJavaSearch = System.currentTimeMillis();
        FindMethodByJava.findMethodJava(stringGenerated,patternGenerated);
        long stopTimeJavaSearch = System.currentTimeMillis();
        System.out.println("Elapsed time was " + (stopTimeJavaSearch - startTimeJavaSearch) + " miliseconds."); // Se muestra por consola el tiempo de ejecución.



        long startTimeAlejoSearch = System.currentTimeMillis();
        FindMethodByAlejo.stringSearch(stringGenerated, patternGenerated);
        long stopTimeAlejoSearch = System.currentTimeMillis();
        System.out.println("Elapsed time was " + (stopTimeAlejoSearch - startTimeAlejoSearch) + " miliseconds."); // Se muestra por consola el tiempo de ejecución.

    }
}