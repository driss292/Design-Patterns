public class thirdDecorator {
    public static void main(String[] args) throws Exception {
        Pizza margherita = new Margherita();
        margherita = new Olive(margherita);

        System.out.println("Description : " + margherita.getDescription() + " | Prix : " + margherita.cout() + " €");

    }
}
