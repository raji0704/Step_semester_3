package session_1.Level1;
import java.util.Scanner;

public class Problem4 {

    void sumNaturalNumbers(int n) {

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of natural numbers: " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Problem4 obj = new Problem4();
        obj.sumNaturalNumbers(n);

        sc.close();
    }
}
