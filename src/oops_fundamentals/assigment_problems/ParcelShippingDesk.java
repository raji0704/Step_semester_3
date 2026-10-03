import java.util.Scanner;

abstract class Parcel {
    double weight, value;

    Parcel(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    abstract double charge();

    double insurance() {
        return 0;
    }

    double total() {
        return charge() + insurance();
    }
}

interface Insurable {
    double getInsurance(double value);
}

class Standard extends Parcel {
    Standard(double weight, double value) {
        super(weight, value);
    }

    double charge() {
        return 40 + 10 * weight;
    }
}

class Express extends Parcel implements Insurable {
    Express(double weight, double value) {
        super(weight, value);
    }

    double charge() {
        return 80 + 15 * weight;
    }

    public double getInsurance(double value) {
        return value * 0.02;
    }

    double insurance() {
        return getInsurance(value);
    }
}

class Fragile extends Parcel implements Insurable {
    Fragile(double weight, double value) {
        super(weight, value);
    }

    double charge() {
        return 40 + 10 * weight + 50;
    }

    public double getInsurance(double value) {
        return value * 0.02;
    }

    double insurance() {
        return getInsurance(value);
    }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            Parcel parcel;

            if (type.equals("STANDARD"))
                parcel = new Standard(weight, value);
            else if (type.equals("EXPRESS"))
                parcel = new Express(weight, value);
            else
                parcel = new Fragile(weight, value);

            double charge = parcel.charge();
            double insurance = parcel.insurance();
            double total = parcel.total();

            System.out.printf(
                    "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                    type, charge, insurance, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);

        sc.close();
    }
}