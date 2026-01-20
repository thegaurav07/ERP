import java.util.ArrayList;

class InventoryManager {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println("Product Added");
    }

    void showProducts() {
        for(Product p : products) {
            p.display();
        }
    }
}
