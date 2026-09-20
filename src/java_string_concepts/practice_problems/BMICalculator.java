package java_string_concepts.practice_problems;

public class BMICalculator {

    static String getBmiStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    static void printWellnessReport(double[] heights, double[] weights) {

        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n",
                "Person", "Height", "Weight", "BMI", "Status");

        for (int i = 0; i < heights.length; i++) {

            double bmi = weights[i] / (heights[i] * heights[i]);

            String status = getBmiStatus(bmi);

            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s%n",
                    i + 1, heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {

        double[] heights = {
                1.65, 1.70, 1.75, 1.60, 1.80,
                1.68, 1.72, 1.58, 1.77, 1.82
        };

        double[] weights = {
                55, 70, 80, 50, 95,
                65, 75, 48, 85, 100
        };

        printWellnessReport(heights, weights);
    }
}
