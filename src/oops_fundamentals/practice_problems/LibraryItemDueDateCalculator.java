import java.time.LocalDate;
import java.util.Scanner;

public class LibraryItemDueDateCalculator {

    interface LibraryItem {
        int getLoanPeriod();
        String getTitle();
    }

    static class Book implements LibraryItem {
        private String title;

        Book(String title) {
            this.title = title;
        }

        public int getLoanPeriod() {
            return 14;
        }

        public String getTitle() {
            return title;
        }
    }

    static class DVD implements LibraryItem {
        private String title;

        DVD(String title) {
            this.title = title;
        }

        public int getLoanPeriod() {
            return 7;
        }

        public String getTitle() {
            return title;
        }
    }

    static class Magazine implements LibraryItem {
        private String title;

        Magazine(String title) {
            this.title = title;
        }

        public int getLoanPeriod() {
            return 3;
        }

        public String getTitle() {
            return title;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ", 2);

            String type = parts[0];
            String title = parts[1].replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title);
            } else if (type.equals("DVD")) {
                item = new DVD(title);
            } else {
                item = new Magazine(title);
            }

            LocalDate dueDate =
                    currentDate.plusDays(item.getLoanPeriod());

            System.out.println(item.getTitle() + ": " + dueDate);
        }

        sc.close();
    }
}