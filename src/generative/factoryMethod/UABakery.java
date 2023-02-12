package generative.factoryMethod;

public class UABakery extends Bakery {
    @Override
    Production createProduct(ProductType type) {
        return switch (type) {
            case Cookies -> new UACookies();
            case Bread -> new UABread();
        };
    }
}
