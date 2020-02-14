package stringAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX="^[CAP]+[0-9]{4}[GHIKLM]+$";

    public ValidateClass(){
        pattern =Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String classes){
        matcher = pattern.matcher(classes);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateClass validateClass = new ValidateClass();
        String[] classes = {"C0318G","M0318G","P0323A"};
        for (String clas:classes) {
            boolean isvalid = validateClass.validate(clas);
            System.out.println(clas+" is valid: "+isvalid);
        }
    }
}
