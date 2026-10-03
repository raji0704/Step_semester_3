import java.util.Scanner;

abstract class Cab {
    double distance;

    Cab(double distance) {
        this.distance = distance;
    }

    abstract double rate();

    double fare() {
        return Math.max(distance * rate(), 100);
    }
}

interface NightService {
    double nightFare(double fare);
}

class Mini extends Cab {
    Mini(double distance) {
        super(distance);
    }

    double rate() {
        return 10;
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double distance) {
        super(distance);
    }

    double rate() {
        return 14;
    }

    public double nightFare(double fare) {
        return fare * 1.20;
    }
}

class SUV extends Cab implements NightService {
    SUV(double distance) {
        super(distance);
    }

    double rate() {
        return 18;
    }

    public double nightFare(double fare) {
        return fare * 1.20;
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            String time = sc.next();

            if (type.equals("MINI") && time.equals("NIGHT")) {
                System.out.println("MINI: night service not available");
                continue;
            }

            Cab cab;

            if (type.equals("MINI"))
                cab = new Mini(distance);
            else if (type.equals("SEDAN"))
                cab = new Sedan(distance);
            else
                cab = new SUV(distance);

            double fare = cab.fare();

            if (time.equals("NIGHT"))
                fare = ((NightService) cab).nightFare(fare);

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}