import java.util.Arrays;

public class SplitByXmlTags {

    public static void main(String[] args) {
        String text = "<STR3>1240F03407CAS60082100200000000000000165169031724671574</STR3><STR4>1240F03407CAS600821002000000000000001651690317246715740000000000000003</STR4>";
        final String PATTERN = "<STR3>(.+?)</STR3>";
//        System.out.println(text.split(PATTERN));
//        System.out.println(text.split("<[^>]*>"));
//        String[] tokensVal = text.split("<STR>(.+?)</STR>");
//        String[] tokensVal = text.split("<STR>[^<]*?</STR>");
//        String[] tokensVal = text.split("<[^>]*>");
        String[] tokensVal = text.split("<[^>]STR(\\d+)>");
//        String[] tokensVal = text.split("<STR>(.+?)</STR>");
        System.out.println("printing singleton");
        System.out.println(Arrays.asList(tokensVal));
//        System.out.println(Arrays.asList(tokensVal).removeAll(Collections.singleton(null)));
        System.out.println("printing singleton completed");
        for (String token : tokensVal) {
            System.out.println(token);
        }
//        System.out.println(String.join(",", tokensVal));
//        System.out.println(text.matches("<[^>]*>"));
        System.out.println(text.matches("<STR.{2}124.+"));
    }
    // https://stackhowto.com/how-to-get-string-between-two-tags-in-java/
    // https://www.tutorialspoint.com/java/lang/string_split.htm#:~:text=split(String%20regex)%20method%20splits,included%20in%20the%20resulting%20array.
    // https://medium.com/@shemar.gordon32/how-to-split-and-keep-the-delimiter-s-d433fb697c65
    // https://stackoverflow.com/questions/2912894/how-to-match-any-character-in-regular-expression

}
