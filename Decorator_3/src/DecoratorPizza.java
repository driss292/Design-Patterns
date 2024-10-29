public abstract class DecoratorPizza extends Pizza {
    protected Pizza pizza;

    public DecoratorPizza(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    public abstract String getDescription();

}
