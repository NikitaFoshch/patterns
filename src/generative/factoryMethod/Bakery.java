package generative.factoryMethod;

public abstract class Bakery {
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
