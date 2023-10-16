import java.util.List;
import java.util.Random;

public class ChoiceProducts implements Runnable{
    Person person = new Person();
    Products products = new Products();
    Random random = new Random();

    @Override
    public void run() {
        int countProducts;
        products.fillProducts();
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Сейчас очередь - " + person.humans().get(i));
                countProducts = random.nextInt(10);

                System.out.println("Он купил " + countProducts + " товаров, а именно:");
                while (countProducts > 0) {
                    System.out.println(products.products.get(countProducts));
                    countProducts--;
                }
                //System.out.println("Сумма всех товаров составила -" );
                System.out.println();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
