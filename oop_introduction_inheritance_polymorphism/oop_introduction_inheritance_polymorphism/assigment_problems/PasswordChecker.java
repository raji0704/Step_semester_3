package oop_introduction_inheritance_polymorphism.assigment_problems;

public class PasswordChecker {

    static class Password {

        private final String password;

        public Password(String password) {
            this.password = password;
        }

        public String getStrength() {

            int length = password.length();

            if (length < 6) {
                return "Weak";
            } else if (length <= 9) {
                return "Medium";
            } else {
                return "Strong";
            }
        }
    }

    public static void main(String[] args) {

        Password pc = new Password("abcd");
        System.out.println("Password strength: " + pc.getStrength());

        Password pc2 = new Password("abcdefghij");
        System.out.println("Password strength: " + pc2.getStrength());

        Password pc3 = new Password("abcdefgh1234");
        System.out.println("Password strength: " + pc3.getStrength());
    }
}