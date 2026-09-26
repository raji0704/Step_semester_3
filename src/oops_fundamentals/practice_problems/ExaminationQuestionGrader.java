import java.util.Scanner;

public class ExaminationQuestionGrader {

    interface Question {
        double calculateScore();
        String getType();
    }

    static class MCQQuestion implements Question {
        private String correctAnswer;
        private String studentAnswer;
        private double points;

        MCQQuestion(String correctAnswer, String studentAnswer, double points) {
            this.correctAnswer = correctAnswer;
            this.studentAnswer = studentAnswer;
            this.points = points;
        }

        public double calculateScore() {
            return correctAnswer.equals(studentAnswer) ? points : 0;
        }

        public String getType() {
            return "MCQ";
        }
    }

    static class TFQuestion implements Question {
        private String correctAnswer;
        private String studentAnswer;
        private double points;

        TFQuestion(String correctAnswer, String studentAnswer, double points) {
            this.correctAnswer = correctAnswer;
            this.studentAnswer = studentAnswer;
            this.points = points;
        }

        public double calculateScore() {
            return correctAnswer.equals(studentAnswer) ? points : 0;
        }

        public String getType() {
            return "TF";
        }
    }

    static class EssayQuestion implements Question {
        private String correctAnswer;
        private String studentAnswer;
        private double points;

        EssayQuestion(String correctAnswer, String studentAnswer, double points) {
            this.correctAnswer = correctAnswer;
            this.studentAnswer = studentAnswer.toLowerCase();
            this.points = points;
        }

        public double calculateScore() {

            String[] keywords = correctAnswer.split(",");
            int count = 0;

            for (String keyword : keywords) {
                if (studentAnswer.contains(keyword.trim().toLowerCase())) {
                    count++;
                }
            }

            if (count >= 2) {
                return points * 0.75;
            } else if (count == 1) {
                return points * 0.50;
            }

            return 0;
        }

        public String getType() {
            return "ESSAY";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        double totalScore = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String[] parts = line.split("\"");

            String type = parts[0].trim().split("\\s+")[0];

            String questionText;
            String correctAnswer;
            String studentAnswer;
            double points;

            if (parts.length >= 4) {

                String firstPart = parts[0].trim();
                String[] firstTokens = firstPart.split("\\s+", 2);

                questionText = parts[1];
                String remaining = parts[2].trim();

                String[] remainingTokens = remaining.split("\\s+");

                correctAnswer = remainingTokens[0];

                studentAnswer = parts[3].trim();

                String lastPart = parts.length > 4 ? parts[4].trim() : "";

                if (!lastPart.isEmpty()) {
                    points = Double.parseDouble(lastPart);
                } else {
                    points = Double.parseDouble(remainingTokens[remainingTokens.length - 1]);
                }

            } else {

                String[] tokens = line.trim().split("\\s+");

                type = tokens[0];
                questionText = tokens[1];
                correctAnswer = tokens[2];
                studentAnswer = tokens[3];
                points = Double.parseDouble(tokens[4]);
            }

            Question question;

            if (type.equals("MCQ")) {
                question = new MCQQuestion(
                        correctAnswer,
                        studentAnswer,
                        points
                );
            } else if (type.equals("TF")) {
                question = new TFQuestion(
                        correctAnswer,
                        studentAnswer,
                        points
                );
            } else {
                question = new EssayQuestion(
                        correctAnswer,
                        studentAnswer,
                        points
                );
            }

            double score = question.calculateScore();

            System.out.printf("%s: %.2f%n",
                    question.getType(), score);

            totalScore += score;
        }

        System.out.printf("Total Score: %.2f%n", totalScore);

        sc.close();
    }
}