package Week3.Level3;

import java.util.Scanner;

public class Problem1 {

    void printNumberPyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        Problem1 obj = new Problem1();
        obj.printNumberPyramid(n);

        sc.close();
    }
}