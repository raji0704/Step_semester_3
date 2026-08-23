package Week3.Level1;
import java.util.Scanner;

public class Problem2 {

    void classifyNumber(int number) {

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        Problem2 obj = new Problem2();
        obj.classifyNumber(number);

        sc.close();
    }
}
