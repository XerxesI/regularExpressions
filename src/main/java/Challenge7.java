public class Challenge7 {
    public static void main(String[] args) {

        String challenge7 = "abcd.135";
        String challenge8 = "kijsl.22";
        String challenge9 = "f5.13a";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));
        System.out.println(challenge8.matches("^[A-z][a-z]+\\.\\d+$"));
        System.out.println(challenge9.matches("^[A-z][a-z]+\\.\\d+$"));

    }

}
