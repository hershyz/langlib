import java.util.ArrayList;
import java.util.List;

public class Variables {

    //String list:
    static List<String> stringNames = new ArrayList<>();
    static List<String> stringValues = new ArrayList<>();

    //Int list:
    static List<String> intNames = new ArrayList<>();
    static List<Integer> intValues = new ArrayList<>();

    //Double list:
    static List<String> doubleNames = new ArrayList<>();
    static List<Double> doubleValues = new ArrayList<>();

    //Boolean list:
    static List<String> boolNames = new ArrayList<>();
    static List<Boolean> boolValues = new ArrayList<>();

    //Adds a string value:
    public static void addStringValue(String name, String value) {
        stringNames.add(name);
        stringValues.add(value);
    }

    //Adds an int value:
    public static void addIntValue(String name, int value) {
        intNames.add(name);
        intValues.add(value);
    }

    //Adds a double value:
    public static void addDoubleValue(String name, double value) {
        doubleNames.add(name);
        doubleValues.add(value);
    }

    //Adds a boolean value:
    public static void addBooleanValue(String name, boolean value) {
        boolNames.add(name);
        boolValues.add(value);
    }

    //Finds a string value:
    public static String findStringValue(String name) {
        int i;
        for (i = 0; i < stringNames.size(); i++) {
            if (stringNames.get(i).equals(name)) {
                return stringValues.get(i);
            }
        }

        return "";
    }

    //Finds an int value:
    public static int findIntValue(String name) {
        int i;
        for (i = 0; i < intNames.size(); i++) {
            if (intNames.get(i).equals(name)) {
                return intValues.get(i);
            }
        }

        return Integer.MIN_VALUE;
    }

    //Finds a double value:
    public static double findDoubleValue(String name) {
        int i;
        for (i = 0; i < doubleNames.size(); i++) {
            if (doubleNames.get(i).equals(name)) {
                return doubleValues.get(i);
            }
        }

        return Double.MIN_VALUE;
    }

    //Finds a boolean value:
    public static boolean findBooleanValue(String name) {
        int i;
        for (i = 0; i < boolNames.size(); i++) {
            if (boolNames.get(i).equals(name)) {
                return boolValues.get(i);
            }
        }

        return false;
    }
}
