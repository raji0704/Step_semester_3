package classes_and_objects_revision.practice_problems;

public class StudentCollegeInformationManagement {

    static class Student {

        String name;
        double attendance;

        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount = 0;

        Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        static void printCollegeInfo() {
            System.out.println("College: " + collegeName);
            System.out.println("Student Count: " + studentCount);
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ravi", 90.0);
        Student student2 = new Student("Anitha", 85.0);

        Student.printCollegeInfo();
    }
}
