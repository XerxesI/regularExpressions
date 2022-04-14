import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge15Date {
        public static void main(String[] args) {
            String date = "1822-02-02";
            String zipCode2 = "11111";
            final String PATTERN = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";

            System.out.println(date.matches("^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"));
//            System.out.println(zipCode2.matches("^[0-9]{5}(-\\d{4})?$"));

            Pattern pattern = Pattern.compile(PATTERN);
            Matcher matcher = pattern.matcher(date);
            System.out.println("matcher.matches() "+matcher.matches());


        }
}
