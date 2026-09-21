package classes_and_objects_revision.practice_problems;

public class CourseCreditManagement {

    static class Course {

        String code;
        String title;
        int credits;
        int labCredits;

        Course(String code, String title, int credits, int labCredits) {
            this.code = code;
            this.title = title;
            this.credits = credits;
            this.labCredits = labCredits;
        }

        Course(String code, String title, int credits) {
            this(code, title, credits, 0);
        }

        int totalCredits() {
            return credits + labCredits;
        }
    }

    public static void main(String[] args) {

        Course theory = new Course("CS101", "Programming", 4);
        Course lab = new Course("CS102", "Programming Lab", 3, 1);

        System.out.println(theory.title + " -> " + theory.totalCredits());
        System.out.println(lab.title + " -> " + lab.totalCredits());
    }
}
