public class Shop{

    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();

        System.out.println("Магазин открылся!");
        shop.buy();
        System.out.println("Магазин закрылся!");

    }

    public void buy() {
        ChoiceProducts choiceProducts = new ChoiceProducts();
        choiceProducts.run();
    }
}
