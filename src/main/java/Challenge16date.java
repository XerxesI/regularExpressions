public class Challenge16date {
    public static void main(String[] args) {
        final String PATTERN = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        String newPanExpirationDate = "2022-12-12";
        var pattern = java.util.regex.Pattern.compile(PATTERN);
        System.out.println("newPanExpirationDate " + newPanExpirationDate);
        System.out.println(pattern.matcher(newPanExpirationDate).matches());
    }
}
