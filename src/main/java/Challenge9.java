import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge9 {

    public static void main(String[] args) {

        String challenge9 = "aBcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
//        Pattern pattern = Pattern.compile("\\w+\\.(\\d+)");
        Matcher matcher = pattern.matcher(challenge9);
        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
