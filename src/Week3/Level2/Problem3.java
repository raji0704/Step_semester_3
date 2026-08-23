package Week3.Level2;

public class Problem3 {

    void printSkippingMultiplesOfThree() {

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Problem3 obj = new Problem3();
        obj.printSkippingMultiplesOfThree();
    }
}
