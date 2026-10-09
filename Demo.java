public class Demo {
    public static void main(String args[]) {

        Product P1 = new Product("Aamna", 4200.0, 2, new Date(10, 10, 2026));
        System.out.println("Information of first object");
        P1.display();

        Product P2 = new Product("Swera", 4500.0, 3, new Date(11, 10, 2026));
        System.out.println("Information of second object");
        P2.display();

        Product P3 = new Product("Maheen", 9000.0, 7, new Date(12, 10, 2026));
        System.out.println("Information of third object");
        P3.display();

        Product P4 = new Product("Ushna", 2000.0, 6, new Date(13, 10, 2026));
        System.out.println("Information of fourth object");
        P4.display();

        Product.displayMaxMin();
    }
}