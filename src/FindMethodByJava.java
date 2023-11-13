import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethodByJava {

    public static void findMethodJava(String match, String pattern){
        Pattern p = Pattern.compile(pattern); //Se ingresa el patrón a buscar.
        Matcher m = p.matcher(match); // Pasamos por parametro el string previamente cargado aleatoriamente.


        int c = 0; // Contador inicializado.

        while(m.find()) //Se busca la coincidencia hasta el final de string
        {
            c=c+1; //al contador de coincidencías se le suma 1 por cada coincidencia
            System.out.println("Start position of matching String "+m.start()); //Se encuentra la posición inicial
            System.out.println("End position of Matching String (java) "+m.end()); // Se encuentra la posición final
        }
        System.out.println(" Number of matches : "+c);
    }

}
