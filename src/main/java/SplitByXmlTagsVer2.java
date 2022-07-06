import java.util.Arrays;

public class SplitByXmlTagsVer2 {

    public static void main(String[] args) {
        String text = "<TCR4>0504          SD0000                              00000000                                             0000000000000000                             40010030273        1</TCR4><TCR5>0505481252661308902000000000000   00        0000 000000000000                              000000000156000C0000000000000000000000000000F             4819251980500062  2</TCR5><TCR7>050700000210909E0F840233        4EE704AB0001004020C4C3359A274E984263000000000032A000000000000052000000100302730000001F0040000000000000000000000000000023880000         3</TCR7>";
        final String PATTERN = "<STR3>(.+?)</STR3>";

        String[] tokensVal = text.split("<[^>]TCR(\\d+)>");
        System.out.println("printing singleton");
        System.out.println(Arrays.asList(tokensVal));
        System.out.println("printing singleton completed");
        for (String token : tokensVal) {
            System.out.println(token);
            System.out.println(token.matches("<TCR.{16}SD.+"));
        }
        System.out.println(text.matches("<TCR.{16}SD.+"));


    }
}
