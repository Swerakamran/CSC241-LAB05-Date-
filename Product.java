public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private Date md;

    private static int counter = 0;
    private static double minPrice;
    private static double maxPrice;

    Product(String name, double price, int quantity) {
        this(name, price, quantity, new Date(1, 1, 1));
    }

    Product(String name, double price, int quantity, Date md) {
        this.id = String.format("%03d", counter++);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.md = md;

        if (counter == 1) {
            minPrice = price;
            maxPrice = price;
        }

        if (counter > 1 && minPrice > price) {
            minPrice = price;
        }

        if (counter > 1 && maxPrice < price) {
            maxPrice = price;
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Date: " + md);
    }

    public static void displayMaxMin() {
        System.out.println("Maximum price: " + maxPrice);
        System.out.println("Minimum price: " + minPrice);
    }
}