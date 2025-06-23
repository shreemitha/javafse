import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Camera", "Electronics"),
            new Product(5, "T-shirt", "Clothing")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        System.out.println("\n--- Linear Search ---");
        Product linearResult = SearchAlgorithms.linearSearch(products, searchName);
        System.out.println(linearResult != null ? "Product Found: " + linearResult : "Product Not Found");

        System.out.println("\n--- Binary Search ---");
        Product binaryResult = SearchAlgorithms.binarySearch(products, searchName);
        System.out.println(binaryResult != null ? "Product Found: " + binaryResult : "Product Not Found");

        scanner.close();
    }
}
