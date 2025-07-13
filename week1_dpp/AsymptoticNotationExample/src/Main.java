public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Shampoo", "Cosmetics"),
            new Product(105, "Book", "Education"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "Shoes", "Footwear")
        };

        int searchId = 105;

       
        System.out.println("Linear Search:");
        long startTime = System.nanoTime();
        Product result1 = SearchAlgorithms.linearSearch(products, searchId);
        long endTime = System.nanoTime();
        System.out.println("Result: " + result1);
        System.out.println("Time Taken (ns): " + (endTime - startTime));

      
        System.out.println("\n Binary Search:");
        SearchAlgorithms.sortProductsById(products); // Must sort before binary search
        startTime = System.nanoTime();
        Product result2 = SearchAlgorithms.binarySearch(products, searchId);
        endTime = System.nanoTime();
        System.out.println("Result: " + result2);
        System.out.println("Time Taken (ns): " + (endTime - startTime));
    }
}
