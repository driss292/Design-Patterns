public abstract class DecoratorBoisson extends Boisson {

    protected Boisson boisson;

    public DecoratorBoisson(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
