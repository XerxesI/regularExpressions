public class Challange4 {
    public static void main(String[] args) {

        String challenge4 = "Replace all blanks with underscores.";
        challenge4.replaceAll("[ ]","_");
        System.out.println(challenge4.replaceAll(" ","_"));
        System.out.println(challenge4.replaceAll("\\s","_"));
    }
}
