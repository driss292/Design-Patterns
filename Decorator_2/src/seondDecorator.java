public class seondDecorator {
    public static void main(String[] args) throws Exception {
        Boisson espresso = new Espresso();

        espresso = new Caramel(espresso);

        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.cout() + " €");
    }
}
