package Week3.Level1;
 import java.util.Scanner;

public class Problem1 {

    void checkVotingEligibility(int age) {

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Problem1 obj = new Problem1();
        obj.checkVotingEligibility(age);

        sc.close();
    }
}
