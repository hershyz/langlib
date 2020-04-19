public class Identification {

    public static VariableSyntax variableSyntax = new VariableSyntax();
    public static StructureSyntax structureSyntax = new StructureSyntax();

    //Finds out of a line is a variable or not:
    public static boolean isVariable(String line) {

        String firstTerm = getTerm(line, 0);
        if (firstTerm.equals(variableSyntax.stringSyntax) || firstTerm.equals(variableSyntax.doubleSyntax) || firstTerm.equals(variableSyntax.intSyntax) || firstTerm.equals(variableSyntax.boolSyntax)) {
            return true;
        }

        return false;
    }

    //Finds out of a line is a structure declaration:
    public static boolean isStructureDeclaration(String line) {

        String firstTerm = getTerm(line, 0);
        if (firstTerm.equals(structureSyntax.ifSyntax) || firstTerm.equals(structureSyntax.elseSyntax) || firstTerm.equals(structureSyntax.forSyntax) || firstTerm.equals(structureSyntax.whileSyntax) || firstTerm.equals(structureSyntax.functionSyntax)) {
            return true;
        }

        return false;
    }

    //Finds out if the variable referenced is being initialized:
    public static boolean isInitialized(String line) {

        if (isVariable(line)) {
            try {
                String[] arr = line.split("=");
                String rawValue = arr[1].trim();
                if (rawValue.length() > 0) {
                    return true;
                }
            }
            catch (Exception e) {
                return false;
            }
        }

        return false;
    }

    //Returns a variable name that is being initialized:
    public static String getVariableName(String line) {
        return getTerm(line, 1);
    }

    //Returns the assignment value of a variable:
    public static String getAssignmentValue(String line) {
        String[] arr = line.split("=");
        return arr[1].trim();
    }

    //Returns the nth term of a line, split by spaces:
    public static String getTerm(String line, int n) {
        return line.trim().split(" ")[n];
    }

    //Returns the raw text in parenthesis:
    public static String getRawTextInParenthesis(String line) {

        line = line.trim();
        String[] arr = line.split("");
        boolean startRead = false;
        String text = "";

        int i;
        for (i = 0; i < arr.length; i++) {

            if (arr[i].equals(")")) {
                startRead = false;
            }

            if (startRead) {
                text = text + arr[i];
            }

            if (arr[i].equals("(")) {
                startRead = true;
            }
        }

        return text;
    }

    //Returns raw parameters within parenthesis as an array, parameters must be separated by a comma:
    public static String[] getParametersAsArray(String line) {

        String rawParameters = getRawTextInParenthesis(line);
        String[] parameters = rawParameters.split(",");

        int i;
        for (i = 0; i < parameters.length; i++) {
            parameters[i] = parameters[i].trim();
        }

        return parameters;
    }

    //Remove first and last quotes:
    public static String removeQuotes(String line) {

        line = line.trim();
        String[] arr = line.split("");
        String result = "";

        if (arr[0].equals("\"") && arr[arr.length - 1].equals("\"")) {

            int i;
            for (i = 1; i < arr.length - 1; i++) {
                result = result + arr[i];
            }
        }

        return result;
    }
}
