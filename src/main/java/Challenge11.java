import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge11 {
    public static void main(String[] args) {


        String challenge11 = "{0, 2},{0, 5},{1, 3},{2, 4},{x, y},{6, 34},{11, 12}";
        Pattern pattern = Pattern.compile("\\{(\\d+, \\d+)\\}");
//        Pattern pattern = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher = pattern.matcher(challenge11);
        while (matcher.find()){
            System.out.println("Occurence: " + matcher.group(1));
        }
    }
}
