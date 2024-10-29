public class Margherita extends Pizza {

    public Margherita() {
        description = "Pizza Margherita";
    }

    @Override
    public String getDescription() {
        return "Pizza Margherita";
    }

    @Override
    public double cout() {
        return 5;
    }

}
