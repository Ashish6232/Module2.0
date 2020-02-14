package stringAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[(][0-9]{2}[)][-][(](0)[0-9]{9}[)]$";

    public ValidatePhone() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String classes) {
        matcher = pattern.matcher(classes);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhone validatePhone = new ValidatePhone();
        String[] classes = {"(84)-(0978489648)", "(a8)-(22222222)"};
        for (String clas : classes) {
            boolean isvalid = validatePhone.validate(clas);
            System.out.println(clas + " is valid: " + isvalid);
        }
    }
}