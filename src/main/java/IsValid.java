import java.util.regex.Pattern;

public class IsValid {

    public static boolean isValid(String passwordhere) {

        Pattern UpperCasePattern = Pattern.compile("[A-Z ]");
        Pattern lowerCasePattern = Pattern.compile("[a-z ]");
        Pattern specialPattern = Pattern.compile("[-+_!@#$%^&*., ?]");


        boolean bol=true;

        if (passwordhere.length() < 8 || passwordhere.length() > 20) {
            bol=false;
        }
        if (!UpperCasePattern.matcher(passwordhere).find()) {
            bol=false;
        }
        if (!lowerCasePattern.matcher(passwordhere).find()) {
            bol=false;
        }
        if (!specialPattern.matcher(passwordhere).find()) {
            bol=false;
        }

        return bol;

    }
}
