import java.util.ArrayList;
import java.util.List;

public class Functions {

    static List<String> functionNames = new ArrayList<>();             //List of function names
    static List<String[]> functionParameters = new ArrayList<>();      //List of parameters corresponding to the function names

    //Adds a function name with parameters:
    public static void addFunction(String name, String[] parameters) {
        functionNames.add(name);
        functionParameters.add(parameters);
    }
}
