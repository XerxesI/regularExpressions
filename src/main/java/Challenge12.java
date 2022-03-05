public class Challenge12 {
    public static void main(String[] args) {
        String zipCode = "11111";
        System.out.println(zipCode.matches("^[0-9]{5}$"));
        System.out.println(zipCode.matches("^\\d{5}$"));

    }
}
