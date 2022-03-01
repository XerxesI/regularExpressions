import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge2 {
    public static void main(String[] args) {

        String challenge1 = "I want a bike";
        String challenge2 = "I want a ball";
        System.out.println(challenge1.matches("^[A-Z]{1}[ ]{1}.+"));

        String patternString = "I want a \\w+.";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher1 = pattern.matcher(challenge1);
        System.out.println(matcher1.matches());

        Matcher matcher2 = pattern.matcher(challenge2);
        System.out.println(matcher2.matches());

        System.out.println(challenge1.matches("I want a (bike|ball)"));
        System.out.println(challenge2.matches("I want a (bike|ball)"));



    }
}
