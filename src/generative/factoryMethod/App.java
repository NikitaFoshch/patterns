package generative.factoryMethod;

public class App {
    public static void main(String[] arg) {
        Bakery UABakery = new UABakery();
        UABakery.orderProduct(ProductType.Bread);
        Bakery ENBakery = new ENBakery();
        ENBakery.orderProduct(ProductType.Cookies);

    }

}


