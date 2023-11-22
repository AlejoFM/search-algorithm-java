import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Probability_Test {
    public static void main(String[] args) {
        int c = 0; // Contador inicializado.

        Pattern p = Pattern.compile("franzoni"); //Se ingresa el patrón a buscar.
        long stopTime = System.currentTimeMillis();
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        long tries = 0;
        while(c == 0){
            tries++;
//                System.out.println("Running");

            StringBuilder text = new StringBuilder();

            for(int i = 0; i < p.pattern().length(); i++){
                text.append((char)(r.nextInt(26) +97));
            }
//            System.out.println(text.toString());
//            System.out.println(array);
            Matcher m = p.matcher(text.toString()); // Pasamos por parametro el string previamente cargado aleatoriamente.

            while(m.find()) //Se busca la coincidencia hasta el final de string
            {
                c=c+1; //al contador de coincidencías se le suma 1 por cada coincidencia
                System.out.println("Start position of matching String "+m.start()); //Se encuentra la posición inicial
                System.out.println("End position of Matching String (java) "+m.end()); // Se encuentra la posición final
            }
            stopTime = System.currentTimeMillis();
//                System.out.println(" Number of matches : "+c); //Se muestra por consola la cantidad de coincidiencias
        }
        System.out.println("Intentos: " + tries);
        System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds."); // Se muestra por consolaa el tiempo de ejecución.
    }
}
