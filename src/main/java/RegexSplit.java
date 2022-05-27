public class RegexSplit {
    public static void main(String[] args) {
        String challenge5 = "1240F03407CAS600821002000000000000001651690317246715740000000000000003  ";
        System.out.println(challenge5.matches("^.{10}CAS.*$"));
//        System.out.println(challenge5.matches("[abcdefg]+"));
//        System.out.println(challenge5.matches("[a-g]+"));
    }
}
