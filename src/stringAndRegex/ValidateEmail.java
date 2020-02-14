package stringAndRegex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        final String EMAIL_REGEX ="^@(.+)(\\/.+\\/);(\\*.+);(.+)(.*?);*(.*?)$";
        String email ="@anamorphosis /,ænə'mɔ:fəsis/;*danh từ;hình méo mó hình kỳ dị,(do gương chiếu ra);*ngoại động từ,sắp xếp vào một chỗ,sắp đặt theo thứ tự";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher;
        matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
//    private  Pattern pattern;
//    private  Matcher matcher;
//
////    private static final String EMAIL_REGEX ="^[\\w]+[\\w]*.hmu@[\\w]+(\\.[\\w]+)$";
//final String REGEX_NAME = "^[a-zA-Z\\D]{1,50}";
//
//    public ValidateEmail(){
//        pattern = Pattern.compile(REGEX_NAME);
//    }
//
//    public boolean validate(String email){
//        matcher = pattern.matcher(email);
//        return matcher.matches();
//    }
////
//    public static void main(String[] args) {
//        ArrayList arrayList=new ArrayList();
//        ValidateEmail validateEmail = new ValidateEmail();
//        String[] validEmail = new String[]{"n","b5465","bangmac88@gmail.com","thuongtk.bk@gmail.com", "nhamnd.hmu@gmail.com", "abc.9@hotmail.com", "@gmail.com", "ab@gmail."};
//        for (String email : validEmail) {
//            boolean isvalid = validateEmail.validate(email);
//            System.out.println("Email is " + email + " is valid: " + isvalid);
//            arrayList.add(email);
//            System.out.println(email);
//        }
//    }
}
