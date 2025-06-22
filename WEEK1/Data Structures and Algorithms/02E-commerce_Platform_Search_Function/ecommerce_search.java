class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}
public class SearchFunctions {

    // Linear Search
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    // Binary Search
    public static int binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return mid; // Found
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        // Sample Product Array
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Fashion"),
            new Product(303, "Watch", "Accessories"),
            new Product(404, "Phone", "Electronics")
        };

        // For Binary Search: Array should be sorted by productId
        java.util.Arrays.sort(products, (a, b) -> a.productId - b.productId);

        // Example Search
        int targetId = 303;

        // Linear Search Call
        int linearIndex = linearSearch(products, targetId);
        System.out.println("Linear Search: Product found at index: " + linearIndex);

        // Binary Search Call
        int binaryIndex = binarySearch(products, targetId);
        System.out.println("Binary Search: Product found at index: " + binaryIndex);
    }
}
