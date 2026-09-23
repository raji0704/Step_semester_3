package oop_introduction_inheritance_polymorphism.assigment_problems;

public class TrafficLight {

    static class Light {

        private String color;
        private final String id;

        public Light(String id) {
            this.id = id;
            this.color = "RED";
        }

        public void next() {

            if (color.equals("RED")) {
                color = "GREEN";
            } else if (color.equals("GREEN")) {
                color = "YELLOW";
            } else {
                color = "RED";
            }
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {

        Light t = new Light("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}