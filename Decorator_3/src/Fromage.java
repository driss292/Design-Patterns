public class Fromage extends DecoratorPizza {

    Pizza pizza;

    public Fromage(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", fromage";
    }

    @Override
    public double cout() {
        return 0.8 + pizza.cout();
    }
}
