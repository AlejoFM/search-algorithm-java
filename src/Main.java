import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del string: ");
        Scanner stringSize = new Scanner(System.in); //Gen era el tamaño del string mediante input por el usuario
        String stringGenerated = StringGen.generateString(stringSize);
        System.out.println("Ingrese el tamaño del patrón a buscar dentro del string : ");
        Scanner patternSize = new Scanner(System.in); //Genera el tamaño del patrón mediante input por el usuario
        String patternGenerated = StringGen.generateString(patternSize);


        long startTimeJavaSearch = System.currentTimeMillis();
        List<Integer> searchResultJava = FindMethodByJava.findMethodJava(stringGenerated,patternGenerated);
        long stopTimeJavaSearch = System.currentTimeMillis();
        System.out.println("Elapsed time was " + (stopTimeJavaSearch - startTimeJavaSearch) + " miliseconds."); // Se muestra por consola el tiempo de ejecución.
        showPositions(searchResultJava.listIterator(), patternGenerated.length());


        long startTimeAlejoSearch = System.currentTimeMillis();
        List<Integer> searchResultAlejo = FindMethodByAlejo.stringSearch(stringGenerated, patternGenerated);
        long stopTimeAlejoSearch = System.currentTimeMillis();
        System.out.println("Elapsed time was " + (stopTimeAlejoSearch - startTimeAlejoSearch) + " miliseconds."); // Se muestra por consola el tiempo de ejecución.
        showPositions(searchResultAlejo.listIterator(), patternGenerated.length());
    }
    private static void showPositions(ListIterator<Integer> iterator, int patternLength) {
        System.out.println("Positions found:");
        while (iterator.hasNext()) {
            int startPosition = iterator.next();
            int endPosition = startPosition + patternLength - 1;
            System.out.println("Start position: " + startPosition + ", End position: " + endPosition);
        }
    }
}