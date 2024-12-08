public class grocery_receipt {
    public static void main (String[] args) {
        String[] products = {"meat", "fruits", "vegetables", "tuna"};
        double[] prices = {55.5, 22.0, 15.6, 25.0};

        double total = 0;
        double discount_rate = 0.10;
        double discount;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]+ ": " + prices[i] + "pounds");
            total = total + prices[i];
        }

        System.out.println("total before discount: " + total);

        if (total > 100) {
            discount = total * discount_rate;
            total = total - discount;
            System.out.println("discount: " + discount);
        }

        System.out.println("total after discount: " + total);
    }
}
