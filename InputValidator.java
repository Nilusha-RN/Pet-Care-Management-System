public class InputValidator {

    public static int getPositiveNumber(String value) {

        try {

            int number = Integer.parseInt(value);

            if (number < 0) {
                throw new IllegalArgumentException(
                        "Number cannot be negative."
                );
            }

            return number;

        } catch (NumberFormatException e) {

            System.out.println("Invalid number entered.");
            return 0;

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return 0;
        }
    }
}