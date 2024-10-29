public class Olive extends DecoratorPizza {

    public Olive(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", aux olives";
    }

    @Override
    public double cout() {
        return 1.5 + pizza.cout();
    }

}
