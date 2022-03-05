public class Challenge14 {
    public static void main(String[] args) {
        String zipCode1 = "11111-1111";
        String zipCode2 = "11111";

        System.out.println(zipCode1.matches("^[0-9]{5}(-\\d{4})?$"));
        System.out.println(zipCode2.matches("^[0-9]{5}(-\\d{4})?$"));
    }
}
