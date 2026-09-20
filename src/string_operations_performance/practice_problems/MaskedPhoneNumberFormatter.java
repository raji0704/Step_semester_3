package string_operations_performance.practice_problems;

public class MaskedPhoneNumberFormatter {

    String maskPhoneNumber(String phone) {

        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        String lastFourDigits = phone.substring(6);

        StringBuilder result = new StringBuilder("XXXXXX");
        result.insert(6, "-");
        result.append(lastFourDigits);

        return result.toString();
    }

    public static void main(String[] args) {
        MaskedPhoneNumberFormatter obj = new MaskedPhoneNumberFormatter();

        System.out.println(obj.maskPhoneNumber("9876543210"));
        System.out.println(obj.maskPhoneNumber("98765"));
    }
}