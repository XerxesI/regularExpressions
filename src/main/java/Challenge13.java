public class Challenge13 {
    public static void main(String[] args) {
        String zipCode = "11111-1111";
        System.out.println(zipCode.matches("^[0-9]{5}-\\d{4}$"));
        System.out.println(zipCode.matches("^\\d{5}-\\d{4}$"));
    }
}
