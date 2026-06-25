package Algorithms_DataStructures.EcommerceSearch;

public class SearchProgram {

    public static ProductInfo findProduct(ProductInfo[] list, String searchName) {

        for (ProductInfo item : list) {

            if (item.itemName.equalsIgnoreCase(searchName)) {
                return item;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        ProductInfo[] products = {
                new ProductInfo(101, "Laptop", "Electronics"),
                new ProductInfo(102, "Shoes", "Fashion"),
                new ProductInfo(103, "Phone", "Electronics"),
                new ProductInfo(104, "Watch", "Accessories")
        };

        ProductInfo result = findProduct(products, "Phone");

        if (result != null) {

            System.out.println("Product Found");
            System.out.println("ID : " + result.itemId);
            System.out.println("Name : " + result.itemName);
            System.out.println("Category : " + result.category);

        } else {

            System.out.println("Product not available.");

        }

    }
}
