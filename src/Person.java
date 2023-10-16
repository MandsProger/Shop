import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Person {
    private List<String> humans = new ArrayList<>();
    HashMap<Integer, String> shoppingCart = new HashMap();
    int sum;

    public HashMap<Integer, String> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(HashMap<Integer, String> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<String> getHumans() {
        return humans;
    }

    public void setHumans(List<String> humans) {
        this.humans = humans;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public List<String> humans() {
        for (int i = 0; i < 10; i++) {
            humans.add("id-000"+i);
        }
        return humans;
    }

    public void buyProduct() {
        Random random = new Random();
        int countProducts;


    }
}
