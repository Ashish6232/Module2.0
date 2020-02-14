package stringAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAcount {
    private Pattern pattern;
    private Matcher matcher;

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public ValidateAcount(){
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String acount){
        matcher = pattern.matcher(acount);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateAcount validateAcount = new ValidateAcount();
        String[] validaccounts={"123abc_","_abc123", "______", "123456",".@", "12345", "1234_"};
        for (String account:validaccounts) {
            boolean isValid = validateAcount.validate(account);
            System.out.println(account+" is valid: "+isValid);
        }
    }
}
