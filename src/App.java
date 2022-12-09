public class App {
    public static void main(String[] arg) {
        Bakery UABakery = new UABakery();
        UABakery.orderProduct(ProductType.Bread);
        Bakery ENBakery = new ENBakery();
        ENBakery.orderProduct(ProductType.Cookies);

    }
}

enum ProductType {
    Bread,
    Cookies
}

class UABread extends Production {
}

class ENBread extends Production {
}

class UACookies extends Production {
}

class ENCookies extends Production {
}


abstract class Production {
    public void takeDough() {
    }

    public void addIngredients() {
    }

    public void bake() {
    }
}

abstract class Bakery {
    public Production orderProduct(ProductType type) {
        Production production = createProduct(type);

        production.takeDough();
        production.addIngredients();
        production.bake();

        System.out.println("Your order! " + type);
        return production;
    }

    abstract Production createProduct(ProductType type);
}

class UABakery extends Bakery {
    @Override
    Production createProduct(ProductType type) {
        return switch (type) {
            case Cookies -> new UACookies();
            case Bread -> new UABread();
        };
    }
}

class ENBakery extends Bakery {
    @Override
    Production createProduct(ProductType type) {
        return switch (type) {
            case Cookies -> new ENCookies();
            case Bread -> new ENBread();
        };
    }
}