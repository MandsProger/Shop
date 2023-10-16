
import java.util.HashMap;

public class Products {
    private String name;
    private int price;
    HashMap<Integer, String> products = new HashMap();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HashMap<Integer, String> fillProducts() {
        for (int i = 0; i < 10; i++) {
            products.put(i, "name" +(i+1));
        }
        return products;
    }

    public HashMap<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Integer, String> products) {
        this.products = products;
    }
}
