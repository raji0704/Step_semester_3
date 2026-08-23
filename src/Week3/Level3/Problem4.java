package Week3.Level3;

import java.util.Scanner;

public class Problem4 {

    void generateFirstValidTable(int[] candidates) {

        for (int i = 0; i < candidates.length; i++) {

            int number = candidates[i];

            if (number < 1) {
                System.out.println("Skipping invalid number: " + number);
                continue;
            }

            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " x " + j + " = " + (number * j));
            }

            break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        System.out.println("Enter candidate numbers:");

        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        Problem4 obj = new Problem4();
        obj.generateFirstValidTable(candidates);

        sc.close();
    }
}
