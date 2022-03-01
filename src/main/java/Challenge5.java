public class Challenge5 {
    public static void main(String[] args) {

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a]{3}[b]{1}[c]{8}[d]{3}[e]{1}[f]{3}[g]{1}"));
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));
    }
}
