package generative.factoryMethod;

public class ENBakery extends Bakery {
    @Override
    Production createProduct(ProductType type) {
        return switch (type) {
            case Cookies -> new ENCookies();
            case Bread -> new ENBread();
        };
    }
}
