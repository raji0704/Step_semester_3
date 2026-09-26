import java.time.LocalDate;
import java.util.Scanner;

interface SubscriptionPlan {
    LocalDate calculateRenewalDate(LocalDate startDate);
    String getPlanType();
}

class BasicPlan implements SubscriptionPlan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate.plusDays(30);
    }

    public String getPlanType() {
        return "BASIC";
    }
}

class StandardPlan implements SubscriptionPlan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate.plusDays(90);
    }

    public String getPlanType() {
        return "STANDARD";
    }
}

class PremiumPlan implements SubscriptionPlan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate.plusDays(365);
    }

    public String getPlanType() {
        return "PREMIUM";
    }
}

public class StreamingPlanRenewalReminder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            LocalDate startDate = LocalDate.parse(sc.next());

            SubscriptionPlan plan;

            if (type.equals("BASIC")) {
                plan = new BasicPlan();
            } else if (type.equals("STANDARD")) {
                plan = new StandardPlan();
            } else {
                plan = new PremiumPlan();
            }

            LocalDate renewalDate =
                    plan.calculateRenewalDate(startDate);

            System.out.printf("%s: %s%n",
                    name, renewalDate);
        }

        sc.close();
    }
}
