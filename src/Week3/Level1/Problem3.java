package Week3.Level1;
import java.util.Scanner;

public class Problem3 {

    void printNumbers(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Problem3 obj = new Problem3();
        obj.printNumbers(n);

        sc.close();
    }
}
