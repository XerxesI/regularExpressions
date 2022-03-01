import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge3 {
    public static void main(String[] args) {

        String challenge1 = "I want a bike";
        String challenge2 = "I want a ball";

        String patternString = "I want a \\w+.";
        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher1 = pattern.matcher(challenge1);
        System.out.println(matcher1.matches());
        matcher1 = pattern.matcher(challenge2);
        System.out.println(matcher1.matches());

    }
}
