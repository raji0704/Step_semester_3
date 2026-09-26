import java.util.Scanner;

interface Room {
    double calculateBill();
    String getType();
}

class SingleRoom implements Room {
    private int units;

    SingleRoom(int units) {
        this.units = units;
    }

    public double calculateBill() {
        return units * 8;
    }

    public String getType() {
        return "SINGLE";
    }
}

class SharedRoom implements Room {
    private int units;
    private int occupants;

    SharedRoom(int units, int occupants) {
        this.units = units;
        this.occupants = occupants;
    }

    public double calculateBill() {
        return (units * 6) / occupants;
    }

    public String getType() {
        return "SHARED";
    }
}

class ACRoom implements Room {
    private int units;

    ACRoom(int units) {
        this.units = units;
    }

    public double calculateBill() {
        return (units * 10) + 200;
    }

    public String getType() {
        return "AC";
    }
}

public class HostelElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int units = sc.nextInt();

            Room room;

            if (type.equals("SINGLE")) {
                room = new SingleRoom(units);
            } else if (type.equals("SHARED")) {
                int occupants = sc.nextInt();
                room = new SharedRoom(units, occupants);
            } else {
                room = new ACRoom(units);
            }

            double bill = room.calculateBill();

            System.out.printf("%s: %.2f%n",
                    room.getType(), bill);

            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
