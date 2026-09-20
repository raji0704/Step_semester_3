package string_operations_performance.assigment_problems;

public class LibraryISBNNormalizer {

    String normalizeCode(String raw) {
        raw = raw.trim();

        if (raw.length() < 3) {
            return raw.toUpperCase();
        }

        String publisherCode = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return publisherCode + rest;
    }

    String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String publisherCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        StringBuilder result = new StringBuilder();

        result.append("[")
                .append(publisherCode)
                .append("] YEAR: ")
                .append(year)
                .append(" | CATALOG: ")
                .append(catalog);

        return result.toString();
    }

    public static void main(String[] args) {

        LibraryISBNNormalizer obj = new LibraryISBNNormalizer();

        String code1 = obj.normalizeCode(" pen2026004251 ");
        System.out.println(obj.validateAndFormat(code1));

        String code2 = obj.normalizeCode("12N2026004251");
        System.out.println(obj.validateAndFormat(code2));
    }
}