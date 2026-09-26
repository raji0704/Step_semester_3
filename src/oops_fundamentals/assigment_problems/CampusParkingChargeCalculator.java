import java.util.Scanner;

interface Vehicle {
    double calculateCharge();
    String getType();
}

class Bike implements Vehicle {
    private int hours;

    Bike(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return hours * 10;
    }

    public String getType() {
        return "BIKE";
    }
}

class Car implements Vehicle {
    private int hours;

    Car(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return 30 + (hours - 1) * 20;
    }

    public String getType() {
        return "CAR";
    }
}

class Truck implements Vehicle {
    private int hours;

    Truck(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return Math.max(hours * 50, 100);
    }

    public String getType() {
        return "TRUCK";
    }
}

public class CampusParkingChargeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int hours = sc.nextInt();

            Vehicle vehicle;

            if (type.equals("BIKE")) {
                vehicle = new Bike(hours);
            } else if (type.equals("CAR")) {
                vehicle = new Car(hours);
            } else {
                vehicle = new Truck(hours);
            }

            double charge = vehicle.calculateCharge();

            System.out.printf("%s: %.2f%n",
                    vehicle.getType(), charge);

            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
