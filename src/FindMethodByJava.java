import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethodByJava {

    public static List<Integer> findMethodJava(String match, String pattern){
        Pattern p = Pattern.compile(pattern); //Se ingresa el patrón a buscar.
        Matcher m = p.matcher(match); // Pasamos por parametro el string previamente cargado aleatoriamente.


        List<Integer> Positions = new ArrayList<>();
        while(m.find()) //Se busca la coincidencia hasta el final de string
        {
            Positions.add(m.start());
        }

        return Positions;
    }

}
