public class Decorator {
    public static void main(String[] args) throws Exception {

        // Création dessert gaufre avec du chocolat en supplément
        Dessert dessert1 = new Gaufre();
        dessert1 = new Chocolat(dessert1);
        System.out.println(dessert1);

        // Création dessert crêpe avec du chocolat & chantilly en supplément
        Dessert dessert2 = new Crepe();
        dessert2 = new Chocolat(dessert2);
        dessert2 = new Chantilly(dessert2);
        System.out.println(dessert2);
    }
}
