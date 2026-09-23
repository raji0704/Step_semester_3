package oop_introduction_inheritance_polymorphism.practice_problems;

public class AttendanceSheet {

    static class Sheet {

        private String[] presentNames;
        private int count;

        public Sheet(int capacity) {
            presentNames = new String[capacity];
            count = 0;
        }

        public void markPresent(String name) {

            if (isPresent(name)) {
                return;
            }

            if (count < presentNames.length) {
                presentNames[count] = name;
                count++;
            }
        }

        public int getPresentCount() {
            return count;
        }

        public boolean isPresent(String name) {

            for (int i = 0; i < count; i++) {
                if (presentNames[i].equals(name)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Sheet sheet = new Sheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}