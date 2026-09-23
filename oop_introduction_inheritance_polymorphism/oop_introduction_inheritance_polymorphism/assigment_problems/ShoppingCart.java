package oop_introduction_inheritance_polymorphism.assigment_problems;

public class ShoppingCart {

    static class Cart {

        private double[] itemPrices;
        private int itemCount;
        private final String cartId;

        public Cart(String cartId, int maximumItems) {
            this.cartId = cartId;
            this.itemPrices = new double[maximumItems];
            this.itemCount = 0;
        }

        public void addItem(double price) {
            if (itemCount < itemPrices.length) {
                itemPrices[itemCount] = price;
                itemCount++;
            }
        }

        public double getTotal() {
            double total = 0;

            for (int i = 0; i < itemCount; i++) {
                total += itemPrices[i];
            }

            return total;
        }

        public int getItemCount() {
            return itemCount;
        }
    }

    public static void main(String[] args) {

        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}